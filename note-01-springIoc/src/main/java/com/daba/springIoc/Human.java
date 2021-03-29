package com.daba.springIoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Human {

    @Autowired
    private Pet pet;
    @Value("haoen")
    private String name;


    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playWithPet() {
        pet.make_sounds();
    }

    @Override
    public String toString() {
        return "Human{" +
                "pet=" + pet +
                ", name='" + name + '\'' +
                '}';
    }
}
