package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hero;

@RestController
public class HeroController {
    @Autowired
    HeroRepository heroRepository;



    public HeroController(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    // @PostMapping("/heroes/{id}/superpowers")
    // public ResponseEntity<Hero> addSuperpower(@PathVariable Long id, @RequestBody String superpower) {
    //     Optional<Hero> optionalHero = heroRepository.findById(id);
    //     if (optionalHero.isPresent()) {
    //         Hero hero = optionalHero.get();
    //         hero.getSuperpowers().add(superpower);
    //         heroRepository.save(hero);
    //         return ResponseEntity.ok(hero);
    //     } else {
    //         return ResponseEntity.notFound().build();
    //     }
    // }



    @PostMapping("/saveHero")
    public Hero saveHero(@RequestBody Hero hero) {
       
        return hero.save(hero);
    }

  
     @PostMapping("/saveHeroes")
public ResponseEntity<String> saveHeroes(@RequestBody List<Hero> empData) {
    heroRepository.saveAll(empData);
    return ResponseEntity.ok("Data saved");
}



}




