package com.youssef_ayman.eventregistrationsystem.Repositories;

import com.youssef_ayman.eventregistrationsystem.Models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterationRepo extends JpaRepository<Registration, Long> {
}
