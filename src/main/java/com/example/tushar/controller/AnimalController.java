package com.example.tushar.controller;


import com.example.tushar.model.Animal;
import com.example.tushar.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    AnimalService animalService;


    @Autowired
    public AnimalController(AnimalService animalService){
        this.animalService = animalService;
    }

    @GetMapping("/animal")
    public Animal getAnimalByID(@RequestParam long id){
        return animalService.getAnimalById(id);
    }
}


