package com.ccff.spring.assembling.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "animal")
public class Animal {
    @Value("animal_name_2")
    private String animal_name;
    @Value("animal_type_2")
    private String animal_type;
    @Value("1000000")
    private Long animal_number;

    public String getAnimal_name() {
        return animal_name;
    }

    public void setAnimal_name(String animal_name) {
        this.animal_name = animal_name;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
    }

    public Long getAnimal_number() {
        return animal_number;
    }

    public void setAnimal_number(Long animal_number) {
        this.animal_number = animal_number;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animal_name='" + animal_name + '\'' +
                ", animal_type='" + animal_type + '\'' +
                ", animal_number=" + animal_number +
                '}';
    }
}
