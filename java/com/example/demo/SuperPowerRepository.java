package com.example.demo;
import com.example.demo.entity.SuperPower;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SuperPowerRepository extends JpaRepository<SuperPower, Long> {
    
}