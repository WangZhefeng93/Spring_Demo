package com.ccff.spring.assembling.test;

import com.ccff.spring.assembling.config.AnimalConfig;
import com.ccff.spring.assembling.controller.AnimalController;
import com.ccff.spring.assembling.controller.AnimalController2;
import com.ccff.spring.assembling.pojo.Animal;
import com.ccff.spring.assembling.pojo.Student;
import com.ccff.spring.assembling.service.AnimalService;
import com.ccff.spring.assembling.service.AnimalService2;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class TestAnnotationAssembly {
    private ApplicationContext context;

    @Before
    public void getContainer(){
        context = new AnnotationConfigApplicationContext(AnimalConfig.class);
    }

    @Test
    public void TestComponent(){
        Animal animal = context.getBean(Animal.class);
        System.out.println(animal);
    }

    @Test
    public void TestComponentScan(){
        Animal animal = context.getBean(Animal.class);
        AnimalService animalService = context.getBean(AnimalService.class);
        animalService.animalIdentification(animal);
    }

    @Test
    public void TestAutoWried(){
        AnimalService2 animalService2 = context.getBean(AnimalService2.class);
        animalService2.animalIdentification();
    }

    @Test
    public void TestAnimalController(){
        Animal animal = context.getBean(Animal.class);
        AnimalController animalController = context.getBean(AnimalController.class);
        animalController.printAnimal(animal);

        AnimalController2 animalController2 = context.getBean(AnimalController2.class);
        animalController2.printAnimal2(animal);
    }
}
