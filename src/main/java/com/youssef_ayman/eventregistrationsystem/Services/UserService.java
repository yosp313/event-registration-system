package com.youssef_ayman.eventregistrationsystem.Services;

import com.youssef_ayman.eventregistrationsystem.Models.User;
import com.youssef_ayman.eventregistrationsystem.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{
    @Autowired
    private UserRepo userRepo;

    public User getUserById(Long id){
        return userRepo.findById(id).orElse(null);
    }

    public User createUser(User user){
        return userRepo.save(user);
    }

    public User updateUser(User user){
        return userRepo.save(user);
    }
}
