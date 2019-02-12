package com.example.demo.auth;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ROLE")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private long id;

    @Column(name = "role")
    private String role;
}
