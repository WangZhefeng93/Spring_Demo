package com.ccff.spring.assembling.service;

import com.ccff.spring.assembling.pojo.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("animalServiceImpl2")
public class AnimalServiceImpl2 implements AnimalService2 {
    @Autowired
    private Animal animal;

    @Override
    public void animalIdentification() {
        System.out.println("动物身份是：");
        System.out.println(animal);
    }
}
