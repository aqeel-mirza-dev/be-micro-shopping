package com.mohammad.shopping.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;


@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable().authorizeHttpRequests((requests)->requests
                        .requestMatchers("/accountservice/accounts/detail","/balanceservice/balances/detail","/cardsservice/cards/detail").authenticated()
                        .requestMatchers("/noticeservice/notices/detail","/contactservice/contacts/detail","/register").permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults()).build();
    }

    /*
    @Bean
    public InMemoryUserDetailsManager userDetailService(){
        //approach 1
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("12345")
                .authorities("admin")
                .build();

        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("12345")
                .authorities("read")
                .build();

        //approach 2 where we use noOpPasswordEncoder Bean for generating the users
        UserDetails admin1 = User.withUsername("admin1").password("12345").authorities("admin").build();

        UserDetails user1 = User.withUsername("user1").password("12345").authorities("read").build();

        return new InMemoryUserDetailsManager(admin1,user1);
    }
*/
   // JDBC based user management
    /*@Bean
    public UserDetailsService userDetailsService(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();

    }

}
