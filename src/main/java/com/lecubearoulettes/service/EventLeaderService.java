package com.lecubearoulettes.service;

import com.lecubearoulettes.entity.Customer;
import com.lecubearoulettes.entity.EventLeader;
import com.lecubearoulettes.entity.dto.CustomerDto;

import java.util.List;

public interface EventLeaderService {
    List<EventLeader> findAllEventLeaders();
    EventLeader findEventLeaderById(Long id);
    EventLeader createEventLeaderWithJSon(EventLeader EventLeaderJson);
    EventLeader deleteEventLeader(Long id);
    EventLeader updateEventLeader(EventLeader EventLeaderJson);
}
