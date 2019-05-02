package com.ccff.spring.assembling.service;

import com.ccff.spring.assembling.pojo.Animal;
import org.springframework.stereotype.Component;

@Component("animalServiceImpl")
public class AnimalServiceImpl implements AnimalService {
    @Override
    public void animalIdentification(Animal animal) {
        System.out.println("1：动物身份是：");
        System.out.println(animal);
    }
}
