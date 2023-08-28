package com.example.sprintsecurityapp.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
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

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        Deprecated
//        http.authorizeHttpRequests((requests)-> requests.anyRequest().denyAll());
//        http.httpBasic(withDefaults());
//        http.formLogin(withDefaults());
//        return http.build();
        //custom security configuration for the app
        http.authorizeHttpRequests((requests) -> requests.requestMatchers(
                "/accounts/**",
                "/balance/**",
                "/cards",
                "/loans").authenticated()
                .requestMatchers("/notice", "/contacts").permitAll()
                ).formLogin(withDefaults()).httpBasic(withDefaults());
        //same as using the below concepts
//        http.formLogin(withDefaults());
//        http.httpBasic(withDefaults());
        return http.build();
    }

    //////////// in memory style of approach
//    @Bean
//    public InMemoryUserDetailsManager userDetailsManager(){
////        type 1
////        UserDetails admin = User.withDefaultPasswordEncoder().
////                username("7beast").
////                password("dymond").
////                authorities("admin").build();
////        UserDetails user = User.withDefaultPasswordEncoder().
////                username("user").
////                password("user").
////                authorities("user").build();
////        return new InMemoryUserDetailsManager(user, admin);
//
////        type 2
//        UserDetails admin = User.withUsername("7beast").password("dymond").authorities("admin").build();
//        UserDetails user = User.withUsername("user").password("user").authorities("user").build();
//        return new InMemoryUserDetailsManager(admin, user);
//    }

    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}

