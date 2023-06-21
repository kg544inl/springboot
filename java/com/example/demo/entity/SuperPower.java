package com.example.demo.entity;

import jakarta.persistence.JoinColumns;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name="superpowers")
public class SuperPower {
    

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
     long id;
    @NotBlank(message = "Name is mandatory")
     String name;
     @ManyToOne
     @JoinColumn(name = "employee_id")
    Hero hero;

     public SuperPower() {}

    public SuperPower(String name) {
        this.name = name;
       
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

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }
}
