package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity 
@Table(name = "users")
public class User {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
     long id;
    @NotBlank(message = "Name is mandatory")
     String name;
     @NotBlank(message = "lastName is mandatory")
      String lastName;

    @NotBlank(message = "Email is mandatory")
    @Email
     String email;

    public User() {
    }

    public User(String name,String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
    }

}
