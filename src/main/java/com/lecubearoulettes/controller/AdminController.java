//package com.lecubearoulettes.controller;
//
//import com.lecubearoulettes.entity.Admin;
//import com.lecubearoulettes.service.AdminService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class AdminController {
//
//    AdminService adminService;
//
//    @GetMapping("/admins")
//    public ResponseEntity<List<Admin>> findAllAdmins(){
//        List<Admin> allAdmins = adminService.findAllAdmins();
//        return new ResponseEntity<>(allAdmins, HttpStatus.OK);
//    }
//
//    @GetMapping("/admins/{id}")
//    public ResponseEntity<Admin> findAdminById(@PathVariable Long id){
//        Admin admin = adminService.findAdminById(id);
//        return new ResponseEntity<>(admin, HttpStatus.OK);
//    }
//
//    @PostMapping("/admins")
//    public ResponseEntity<Admin> createAdminWithJson(@RequestBody Admin adminJson){
//        Admin createdAdmin = adminService.createAdminWithJson(adminJson);
//        return new ResponseEntity<>(createdAdmin, HttpStatus.CREATED);
//    }
//
//    @DeleteMapping("/admins/{id}")
//    public ResponseEntity<Admin> deleteAdminById(@PathVariable Long id){
//        Admin admin = adminService.deleteAdmin(id);
//        return new ResponseEntity<>(admin, HttpStatus.OK);
//    }
//
//    @PutMapping("/admins")
//    public ResponseEntity<Admin> updateAdmin(@RequestBody Admin adminJson){
//        Admin updatedAdmin = adminService.updateAdmin(adminJson);
//        return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
//    }
//
//    @PutMapping("/admins/{id}")
//    public ResponseEntity<Admin> updateAdminById(@PathVariable Long id, @RequestBody Admin adminJson){
//        adminJson.setId(id);
//        Admin updatedAdmin = adminService.updateAdmin(adminJson);
//        return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
//    }
//
//    // SETTER SERVICE - injection
//    @Autowired
//    public void setAdminService(AdminService adminService) {
//        this.adminService = adminService;
//    }
//}
