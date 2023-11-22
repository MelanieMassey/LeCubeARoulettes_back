package com.lecubearoulettes.controller;

import com.lecubearoulettes.entity.UserEntity;
import com.lecubearoulettes.security.JWTGenerator;
import com.lecubearoulettes.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("api")
//@CrossOrigin("${front.url}")
//@CrossOrigin(origins = "*", maxAge = 3600)
public class DashboardController {

    // Injecté par le setter
    DashboardService dashboardService;
    JWTGenerator jwtGenerator;

    @GetMapping("/public")
    public String all(){
        return "{'message':'Public access success'}";
    }

    @GetMapping("/user")
//    @PreAuthorize("hasRole('USER')")
    @CrossOrigin(origins = "*")
    @RolesAllowed("USER")
    public String getUserInfo(){
//        String userEmail = jwtGenerator.getUsernameFromJWT(token);
        return "getUserInfo terminé";
//        return dashboardService.getUserInfo(userEmail);
    }

    @Autowired
    public void setDashboardService(DashboardService dashboardService){
        this.dashboardService = dashboardService;
    }
}
