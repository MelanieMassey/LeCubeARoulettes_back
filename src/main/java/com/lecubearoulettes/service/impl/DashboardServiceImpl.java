package com.lecubearoulettes.service.impl;

import com.lecubearoulettes.entity.EventEntity;
import com.lecubearoulettes.entity.UserEntity;
import com.lecubearoulettes.repository.UserRepository;
import com.lecubearoulettes.service.DashboardService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DashboardServiceImpl implements DashboardService {


    private UserRepository userRepository;

    @Override
    public UserEntity getUserInfo(String email) {
        return userRepository.findByEmail(email).get();
    }

    @Override
    public List<EventEntity> getUserEvents(Long id) {
        UserEntity user = userRepository.findById(id).get();
        List<EventEntity> events = user.getEvents();
        return events;
    }
}
