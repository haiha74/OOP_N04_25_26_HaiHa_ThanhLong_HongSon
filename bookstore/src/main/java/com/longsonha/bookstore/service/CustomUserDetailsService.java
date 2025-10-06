package com.longsonha.bookstore.service;

import com.longsonha.bookstore.model.User;
import com.longsonha.bookstore.repository.UserRepository;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepo;

    public CustomUserDetailsService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u = userRepo.findByUsername(username);
        if (u == null) throw new UsernameNotFoundException("User not found: " + username);

        return new org.springframework.security.core.userdetails.User(
            u.getUsername(),
            u.getPassword(),
            List.of(new SimpleGrantedAuthority("ROLE_" + u.getRole())) // -> ROLE_ADMIN
        );
}

}
