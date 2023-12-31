package com.springboot.blog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
//    @Column(nullable = false, unique = true)
//    private String username;
//    @Column(nullable = false, unique = true)
//    private String email;
//    @Column(nullable = false)
//    private String password;
}
