package com.youssef_ayman.eventregistrationsystem.Services;

import com.youssef_ayman.eventregistrationsystem.Models.Event;
import com.youssef_ayman.eventregistrationsystem.Repositories.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepo eventRepo;

    public List<Event> getAllEvents() {
        return eventRepo.findAll();
    }

    public Event getEventById(Long id) {
        return eventRepo.findById(id).orElse(null);
    }

    public Event saveEvent(Event event) {
        return eventRepo.save(event);
    }

    public Event updateEvent(Event event) {
        return eventRepo.save(event);
    }

    public void deleteEvent(Long id) {
        eventRepo.deleteById(id);
    }

}
