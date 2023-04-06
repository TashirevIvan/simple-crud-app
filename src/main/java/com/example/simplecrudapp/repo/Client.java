package com.example.simplecrudapp.repo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "client")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    @Setter
    private String name;

    @Setter
    private String email;
}
