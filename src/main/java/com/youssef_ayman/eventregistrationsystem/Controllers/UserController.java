package com.youssef_ayman.eventregistrationsystem.Controllers;

import com.youssef_ayman.eventregistrationsystem.Models.User;
import com.youssef_ayman.eventregistrationsystem.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public ResponseEntity<?> Login(@PathVariable Long id) {
        //implement authentication logic
        //Return the token
        return ResponseEntity.ok("Login successful");
    }

    @PostMapping("/register")
    public ResponseEntity<?> RegisterUser(@RequestBody User user) {
        userService.createUser(user);
        //Create a new token
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/logout")
    public ResponseEntity<?> Logout() {
        //implement logout
        //Invalidate token or session
        return ResponseEntity.ok("Logout successful");
    }
}
