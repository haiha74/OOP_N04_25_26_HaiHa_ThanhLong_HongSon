package com.longsonha.bookstore.config;

import com.longsonha.bookstore.service.CustomUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@Order(2)
public class SecurityConfigUser {

    private final CustomUserDetailsService userDetailsService;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public SecurityConfigUser(CustomUserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    // ✅ Cấu hình AuthenticationProvider cho USER
    private DaoAuthenticationProvider userAuthProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(passwordEncoder);
        return provider;
    }

    // ✅ Cấu hình bảo mật cho /user/**
    @Bean
    public SecurityFilterChain userSecurity(HttpSecurity http) throws Exception {
        http
            // Áp dụng cho /user/**
            .securityMatcher("/user/**")
            .authenticationProvider(userAuthProvider())

            // PHÂN QUYỀN
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(
                    "/user/login", "/user/register",
                    "/css/**", "/", "/home"
                ).permitAll()
                .anyRequest().hasRole("USER")
            )

            // FORM LOGIN
            .formLogin(form -> form
                .loginPage("/user/login")
                .loginProcessingUrl("/user/login")
                .defaultSuccessUrl("/user/home", true)
                .failureUrl("/user/login?error")
                .permitAll()
            )

            // LOGOUT
            .logout(logout -> logout
                .logoutRequestMatcher(new AntPathRequestMatcher("/user/logout", "GET"))
                .logoutSuccessUrl("/user/login?logout")
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID")
                .permitAll()
            )

            // CSRF (tắt để test logout GET)
            .csrf(csrf -> csrf.disable())

            // Nếu không có quyền
            .exceptionHandling(ex -> ex
                .accessDeniedPage("/user/login")
            );

        return http.build();
    }
}
