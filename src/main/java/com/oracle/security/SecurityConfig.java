//package com.oracle.security;
//
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static sun.net.ftp.FtpDirEntry.Permission.USER;
//
//@Configuration
//public class SecurityConfig {
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http){
////        http
////                        .authorizeHttpRequests(auth->auth
////                        .requestMatchers("/","/status").permitAll()
////                        .anyRequest().authenticated()
////        ).formLogin(Customizer.withDefaults());
//
//        http
//                .authorizeHttpRequests(auth->auth
//                        .requestMatchers("/","/public/**").permitAll()
//                        .requestMatchers("/admin/**").hasRole("ADMIN")
//                        .requestMatchers("/reports/**").hasAnyRole(USER,ADMIN)
//                        .anyRequest().authenticated()).formLogin(Customizer.withDefaults());
//                ).formLogin(Customizer.withDefaults());
//        return http.build();
//    }
//
//    @Bean
//    UserDetailsService users(){
//        UserDetails user = User.withUsername("user")
//                .password("user123")
//                .roles("USER")
//                .build();
//        UserDetails admin = User.withUsername("admin")
//                .password("admin123")
//                .roles("ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(user,admin);
//    }
//
//}
