package com.example.tushar.service;

import org.springframework.stereotype.Service;
import com.example.tushar.model.Animal;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class AnimalServiceImpl implements AnimalService {
    ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(
            new Animal(1,"Bear", 10),
            new Animal(2,"Cat", 15),
            new Animal(3,"Dog", 12),
            new Animal(4,"Bird", 16)
    ));
    public Animal getAnimalById(long id){
        for (Animal animal : animals) {
            if (animal.getId() == id) {
                return animal;
            }

        }
        return null;
    }
}