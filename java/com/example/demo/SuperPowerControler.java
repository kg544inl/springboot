package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SuperPower;
import com.example.demo.entity.User;


@RestController
@RequestMapping("/superpowers")
public class SuperPowerControler {
    @Autowired
    SuperPowerRepository superPowerRepository;

    public SuperPowerControler(SuperPowerRepository superPowerRepository) {
        this.superPowerRepository = superPowerRepository;
    }

    @PostMapping("/saveSuperPower")
    public SuperPower saveSuperPower(@RequestBody SuperPower superPower){
        return superPowerRepository.save(superPower);
    }
}
