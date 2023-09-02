package com.task.devtaha.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_loaction")
@Entity
public class User_Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String exclude;
    private Long latitude;
    private Long longitude;
    @Enumerated(EnumType.STRING)
    private Role role;
}
