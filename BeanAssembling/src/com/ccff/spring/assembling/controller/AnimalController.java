package com.ccff.spring.assembling.controller;

import com.ccff.spring.assembling.pojo.Animal;
import com.ccff.spring.assembling.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("animalController")
public class AnimalController {
    @Autowired
    @Qualifier("animalServiceImpl")
    private AnimalService animalService = null;

    public void printAnimal(Animal animal){
        animalService.animalIdentification(animal);
    }
}
