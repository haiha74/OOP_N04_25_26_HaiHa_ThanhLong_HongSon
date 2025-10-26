package com.longsonha.bookstore.config;

import com.longsonha.bookstore.service.CustomUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@Order(3)
public class SecurityConfigNhanVien {

    private final CustomUserDetailsService userDetailsService;

    public SecurityConfigNhanVien(CustomUserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Bean
    public DaoAuthenticationProvider nhanVienAuthProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder());
        return provider;
    }

    @Bean
    public SecurityFilterChain nhanVienSecurity(HttpSecurity http) throws Exception {
        http
            .securityMatcher("/nhanvien/**")
            .authenticationProvider(nhanVienAuthProvider())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/nhanvien/login", "/css/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/nhanvien/login")
                .loginProcessingUrl("/nhanvien/login")
                .defaultSuccessUrl("/nhanvien/dashboard", true)
                .failureUrl("/nhanvien/login?error")
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/nhanvien/logout")
                .logoutSuccessUrl("/nhanvien/login?logout")
                .permitAll()
            )
            .csrf(csrf -> csrf.disable());

        return http.build();
    }
}
