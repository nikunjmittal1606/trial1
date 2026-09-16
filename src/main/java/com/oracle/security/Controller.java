//package com.oracle.security;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class Controller {
//
//
//    @GetMapping("/status")
//    public String showStatus(){return"App is running";}
//
//    @GetMapping("/public")
//    public String home(){return "Public Home";}
//
//    @GetMapping("/profile")
//    public String profile(Authentication auth){return "Hello" + auth.getName();}
//
//    @GetMapping("/admin/dashboard")
//    public String admin(){return "admin dashboard";}
//
//    @GetMapping("/reports/monthly")
//    public String report(){return "monthly report";}
//}
