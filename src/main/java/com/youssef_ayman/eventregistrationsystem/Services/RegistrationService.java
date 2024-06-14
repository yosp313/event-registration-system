package com.youssef_ayman.eventregistrationsystem.Services;

import com.youssef_ayman.eventregistrationsystem.Models.Event;
import com.youssef_ayman.eventregistrationsystem.Models.Registration;
import com.youssef_ayman.eventregistrationsystem.Models.User;
import com.youssef_ayman.eventregistrationsystem.Repositories.RegisterationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class RegistrationService {
    @Autowired
    private RegisterationRepo registerationRepo;
    @Autowired
    private UserService userService;
    @Autowired
    private EventService eventService;

    public List<Registration> getAllRegistrations() {
        return registerationRepo.findAll();
    }

    public Registration getRegistrationById(Long id) {
        return registerationRepo.findById(id).orElse(null);
    }

    public Registration addRegistration(Long userId, Long eventId) {
        User user = userService.getUserById(userId);
        Event event = eventService.getEventById(eventId);
        Registration registration = new Registration();
        registration.setUser(user);
        registration.setEvent(event);
        registration.setRegistrationDate(LocalDateTime.now());
        return registerationRepo.save(registration);
    }

    public Registration updateRegistration(Registration registration) {
        return registerationRepo.save(registration);
    }

    public void deleteRegistration(Long id) {
        registerationRepo.deleteById(id);
    }
}
