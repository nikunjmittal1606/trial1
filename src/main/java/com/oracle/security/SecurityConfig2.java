//package com.oracle.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig2 {
//
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http){
////        http
////                .authorizeHttpRequests(auth -> auth
////                .requestMatchers("/","/status").permitAll()
////                .anyRequest().authenticated()
////        ).formLogin(Customizer.withDefaults());
//
//        http.authorizeHttpRequests(auth -> auth
//                .requestMatchers("/", "/public/**").permitAll()
//                .requestMatchers("/admin/**").hasRole("ADMIN")
//                        .requestMatchers("")
//                .requestMatchers("/reports/monthly").hasAnyRole("USER", "ADMIN")
//                .anyRequest().authenticated()).formLogin(Customizer.withDefaults())
//                .logout(logout->logout
//                .logoutSuccessUrl("/").permitAll());
//
//        return http.build();
//
//    }
//
//    @Bean
//    UserDetailsService users(PasswordEncoder encoder) {
//        UserDetails user = User.withUsername("user")
//                .password(encoder.encode("user123"))
//                .roles("USER")
//                .build();
//
//        UserDetails admin = User.withUsername("admin")
//                .password(encoder.encode("admin123"))
//                .roles("ADMIN")
//                .build();
//
//        return new InMemoryUserDetailsManager(user, admin);
//    }
//
//
//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//
//
//
//}
