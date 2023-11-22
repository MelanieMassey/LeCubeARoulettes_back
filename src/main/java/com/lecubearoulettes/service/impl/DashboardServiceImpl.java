package com.lecubearoulettes.service.impl;

import com.lecubearoulettes.entity.UserEntity;
import com.lecubearoulettes.repository.UserRepository;
import com.lecubearoulettes.service.DashboardService;
import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl implements DashboardService {

    private UserRepository userRepository;

    @Override
    public UserEntity getUserInfo(String email) {
        return userRepository.findByEmail(email).get();
    }
}
