//package com.lecubearoulettes.service.impl;
//import com.lecubearoulettes.entity.EventLeader;
//import com.lecubearoulettes.exception.CustomerException;
//import com.lecubearoulettes.exception.EventLeaderException;
//import com.lecubearoulettes.repository.EventLeaderDao;
//import com.lecubearoulettes.service.EventLeaderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class EventLeaderServiceImpl implements EventLeaderService {
//
//    private EventLeaderDao eventLeaderDao;
//
//    @Override
//    public List<EventLeader> findAllEventLeaders() {
//        return eventLeaderDao.findAll();
//    }
//
//    @Override
//    public EventLeader findEventLeaderById(Long id) {
//        Optional<EventLeader> optional = eventLeaderDao.findById(id);
//        if(optional.isPresent()) return optional.get();
//        else throw new EventLeaderException("EventLeader not found with given Id: " + id);
//    }
//
//
//    @Override
//    public EventLeader createEventLeaderWithJSon(EventLeader eventLeaderJson) {
//        EventLeader createdEventLeader = eventLeaderDao.save(eventLeaderJson);
//        return createdEventLeader;
//    }
//
//    @Override
//    public EventLeader deleteEventLeader(Long id) {
//        Optional<EventLeader> optionalEventLeader = eventLeaderDao.findById(id);
//
//        if (optionalEventLeader.isPresent()){
//            EventLeader eventLeader = optionalEventLeader.get();
//            eventLeaderDao.delete(eventLeader);
//            return eventLeader;
//        }
//        else throw new EventLeaderException("Event Leader not found for this id: " + id);
//    }
//
//    @Override
//    public EventLeader updateEventLeader(EventLeader eventLeaderJson) {
//        EventLeader existingEventLeader = eventLeaderDao.findById(eventLeaderJson.getId()).orElseThrow( () -> new CustomerException("EventLeader not found for this id: " + eventLeaderJson.getId()));
//
//        // Si existingCustomer, alors pas d'exception renvoyée donc le code continue
//        return eventLeaderDao.save(eventLeaderJson);
//    }
//
//    // SETTER DAO - injection
//    @Autowired
//    public void setEventLeaderDao(EventLeaderDao eventLeaderDao) {
//        this.eventLeaderDao = eventLeaderDao;
//    }
//}
