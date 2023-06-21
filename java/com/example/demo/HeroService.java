package com.example.demo;
import com.example.demo.entity.Hero;
import org.springframework.beans.factory.annotation.Autowired;

public class HeroService {
    @Autowired
    private HeroRepository heroRepository;

    public Hero saveHero(Hero hero) {
        return heroRepository.save(hero);

    }
}
