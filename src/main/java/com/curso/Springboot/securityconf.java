package com.curso.Springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class securityconf {

    @Bean
    SecurityFilterChain filterchain(HttpSecurity http) throws Exception{
    http.authorizeHttpRequests(request ->
            request.requestMatchers("/**").permitAll());
    http.csrf(csrf -> csrf.disable());
    return http.build();
    }
}
