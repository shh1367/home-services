package com.example.homeservices.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public abstract class BaseUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(nullable = false , length = 30)
    private String firstName;
    @Column(nullable = false , length = 30)
    private String lastName ;
    @Column(nullable = false , length = 30 , unique = true)
    private String userName ;
    @Column(nullable = false , length = 30 , unique = true)
    private String emailAddress;
    @Column(nullable = false , length = 8)
    private String password ;
    private UserState userState ;
    private Date date ;
    private  UserRole userRole ;
}
