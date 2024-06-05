package com.youssef_ayman.eventregistrationsystem.Domain.Repositories;

import com.youssef_ayman.eventregistrationsystem.Domain.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
