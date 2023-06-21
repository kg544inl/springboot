package com.example.demo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Entity

@Table(name = "heroes")
public class Hero {
@Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private long id;

    @NotBlank(message = "Name is mandatory") 
    private String name;

    @OneToMany(targetEntity = SuperPower.class, cascade = CascadeType.ALL)
    @JoinColumn(name="fk_hero_id", referencedColumnName = "id")
    private List<SuperPower> superpowers;
    
    public Hero() {}

    public Hero(String name) {
        this.name = name;
        }

        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name=name;
        }
        public List<SuperPower> getSuperpowers() {
            return this.superpowers;
        }
        
        public void setSuperpowers(List<SuperPower> superpowers) {
            this.superpowers = superpowers;
        }
    public void addSuperPower(SuperPower superpower) {
        superpowers.add(superpower);
    }
    public void removeSuperpower(SuperPower toRemove) {
    superpowers.remove(toRemove);}
@Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }

public Hero save(Object emp) {
    return null;
}


}
