package com.ccff.spring.assembling.controller;

import com.ccff.spring.assembling.pojo.Animal;
import com.ccff.spring.assembling.service.AnimalService;
import com.ccff.spring.assembling.service.AnimalService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("animalController2")
public class AnimalController2 {
    private AnimalService animalService = null;

    public AnimalController2(@Autowired @Qualifier(value="animalServiceImpl3")AnimalService animalService) {
        this.animalService = animalService;
    }

    public void printAnimal2(Animal animal){
        animalService.animalIdentification(animal);
    }
}
