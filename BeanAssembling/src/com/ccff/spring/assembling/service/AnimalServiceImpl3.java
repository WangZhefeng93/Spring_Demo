package com.ccff.spring.assembling.service;

import com.ccff.spring.assembling.pojo.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("animalServiceImpl3")
//@Primary
public class AnimalServiceImpl3 implements AnimalService {
    @Override
    public void animalIdentification(Animal animal) {
        System.out.println("3：动物身份是：");
        System.out.println(animal);
    }
}
