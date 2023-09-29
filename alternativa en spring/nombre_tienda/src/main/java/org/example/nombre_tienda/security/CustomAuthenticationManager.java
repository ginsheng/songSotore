package org.example.nombre_tienda.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

@Service
public class CustomAuthenticationManager implements AuthenticationManager {

    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user1 = User.withUsername("admin")
                .password(passwordEncoder().encode("1234"))
                .roles("USER")
                .build();
        UserDetails api = User.withUsername("api")
                .password(passwordEncoder().encode("4321"))
                .roles("API")
                .build();
        return new InMemoryUserDetailsManager(user1, api);
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        final UserDetails userDetails = userDetailsService().loadUserByUsername(authentication.getName());

        if (!passwordEncoder().matches(authentication.getCredentials().toString(), userDetails.getPassword())) {
            throw new BadCredentialsException("Wrong password");
        }

        return new UsernamePasswordAuthenticationToken(new User(userDetails.getUsername(), userDetails.getPassword(),
                userDetails.getAuthorities()),
                userDetails.getPassword(),
                userDetails.getAuthorities());

    }

    private PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
