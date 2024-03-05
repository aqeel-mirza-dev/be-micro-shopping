package com.mohammad.shopping.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        //http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
        return http.authorizeHttpRequests((requests)->requests
                        .requestMatchers("/accountservice/accounts/detail","/balanceservice/balances/detail","/cardsservice/cards/detail").authenticated()
                        .requestMatchers("/noticeservice/notices/detail","/contactservice/contacts/detail").permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults()).build();
        //return http.build();
    }
}
