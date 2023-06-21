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

import com.example.demo.entity.User;

@RestController
@RequestMapping("/users")
public class UserControler {
    @Autowired
    UserRepository userRepository;

    public UserControler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/findByLastName/{lastName}")
    public ResponseEntity<User> findByLastName(@PathVariable String lastName) {
        Optional<User> userOptional = userRepository.findByLastName(lastName);
        if(userOptional.isPresent()) {
            return ResponseEntity.ok(userOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
