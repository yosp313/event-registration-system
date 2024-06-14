package com.youssef_ayman.eventregistrationsystem.Controllers;


import com.youssef_ayman.eventregistrationsystem.Models.Registration;
import com.youssef_ayman.eventregistrationsystem.Services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @GetMapping
    public List<Registration> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }

    @GetMapping("/{id}")
    public Registration getRegistrationById(@PathVariable Long id) {
        return registrationService.getRegistrationById(id);
    }

    @PostMapping
    public Registration addRegistration(@RequestBody Registration registration) {
        return registrationService.addRegistration(registration.getUser().getId(), registration.getEvent().getId());
    }

    @PutMapping("/{id}")
    public Registration updateRegistration(@PathVariable Long id, @RequestBody Registration registration) {
        registration.setId(id);
        return registrationService.updateRegistration(registration);
    }

    @DeleteMapping("/{id}")
    public void deleteRegistration(@PathVariable Long id) {
        registrationService.deleteRegistration(id);
    }
}
