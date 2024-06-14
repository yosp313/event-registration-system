package com.youssef_ayman.eventregistrationsystem.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , length = 50)
    private String username;

    @Column(nullable = false , length = 100)
    private String email;

    @Column(nullable = false , length = 100)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role{
        USER, ADMIN
    }
}
