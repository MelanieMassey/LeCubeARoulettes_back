//package com.lecubearoulettes.demo;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.security.RolesAllowed;
//
//@RestController
//@RequestMapping("/api")
//public class DemoController {
//
//    @GetMapping("/public")
//    public String all(){
//        return "{'message':'Public access success'}";
//    }
//
//    @GetMapping("/user")
//    @RolesAllowed("USER")
//    public String users(){
//        return "{'message':'User access success'}";
//    }
//
//    @GetMapping("/admin")
//    public String admin(){
//        return "{'message':'Admin access success'}";
//    }
//}
