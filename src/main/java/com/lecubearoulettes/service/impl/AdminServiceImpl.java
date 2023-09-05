package com.lecubearoulettes.service.impl;

import com.lecubearoulettes.entity.Admin;
import com.lecubearoulettes.exception.AdminException;
import com.lecubearoulettes.repository.AdminDao;
import com.lecubearoulettes.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    private AdminDao adminDao;

    @Override
    public List<Admin> findAllAdmins() {
        return adminDao.findAll();
    }

    @Override
    public Admin findAdminById(Long id) {
        Optional<Admin> optionalAdmin = adminDao.findById(id);
        if(optionalAdmin.isPresent()) return optionalAdmin.get();
        else throw new AdminException("Admin not found with given id: " + id);
    }

    @Override
    public Admin createAdminWithJson(Admin adminJson) {
        return adminDao.save(adminJson);
    }

    @Override
    public Admin deleteAdmin(Long id) {
        Optional<Admin> optionalAdmin = adminDao.findById(id);
        if (optionalAdmin.isPresent()){
            Admin admin = optionalAdmin.get();
            adminDao.delete(admin);
            return admin;
        }
        else throw new AdminException("Admin not found with the id: " + id);
    }

    @Override
    public Admin updateAdmin(Admin adminJson) {
        Admin existingAdmin = adminDao.findById(adminJson.getId()).orElseThrow(()-> new AdminException("Admin not found with the id: " + adminJson.getId()));

        // Si existingAdmin le code continue, sinon exception renvoyée
        Admin updatedAdmin = adminDao.save(adminJson);

        return updatedAdmin;
    }

    // SETTER DAO - injection
    @Autowired
    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }
}
