package com.oracle.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
    @PreAuthorize("#username==authentication.name or hasRole('ADMIN')")
    @GetMapping("/users/{username}")
    public String userPage(@PathVariable String username){return "Profile for"+username;}

    @GetMapping("/status")
    public String showStatus(){
        return "app is running";
    }

    @GetMapping("/")
    public String home(){
        return "public home";
    }

    @GetMapping("/profile")
    public String profile(Authentication auth){
        return "Hello " + auth.getName();
    }

    @GetMapping("/admin/dashboard")
    public String admin(){
        return "admin dashboard";
    }

    @GetMapping("/reports/monthly")
    public String report(){
        return "monthly report";
    }

    @GetMapping("/reports/export")
    public String reportExport(){
        return "monthly reportExport";
    }
}