package com.lecubearoulettes.controller;

import com.lecubearoulettes.entity.EventEntity;
import com.lecubearoulettes.entity.UserEntity;
import com.lecubearoulettes.security.JWTGenerator;
import com.lecubearoulettes.service.DashboardService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("api/dashboard")
@CrossOrigin("${front.url}")
//@CrossOrigin(origins = "*", maxAge = 3600)
public class DashboardController {

    // Injecté par le setter
    DashboardService dashboardService;
//    JWTGenerator jwtGenerator;

    @GetMapping("/user/{id}/events")
    public List<EventEntity> getUserEvents(@PathVariable Long id){
        System.out.println("GETUSEREVENTS");
        return dashboardService.getUserEvents(id);
    }


//    @GetMapping("/user")
//    @RolesAllowed("USER")
//    public UserEntity getUserInfo(HttpServletRequest request ){
//        String bearerToken = request.getHeader("Authorization"); // On récupère toute la chaine
//        String token;
//        String userEmail;
//        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")){
//            token = bearerToken.substring(7, bearerToken.length()); //  7= nombre de caractières dans "Bearer "
//            userEmail = jwtGenerator.getUsernameFromJWT(token);
//            return dashboardService.getUserInfo(userEmail);
//        }
//        return null;
//        return "getUserInfo terminé";
//    }

    @Autowired
    public void setDashboardService(DashboardService dashboardService){
        this.dashboardService = dashboardService;
    }
}
