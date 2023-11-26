package com.lecubearoulettes.service;

import com.lecubearoulettes.entity.EventEntity;
import com.lecubearoulettes.entity.UserEntity;

import java.util.List;

public interface DashboardService {
    UserEntity getUserInfo(String email);


    List<EventEntity> getUserEvents(Long id);
}
