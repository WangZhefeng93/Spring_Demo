package com.ccff.spring.assembling.config;

import com.ccff.spring.assembling.controller.AnimalController;
import com.ccff.spring.assembling.pojo.Animal;
import com.ccff.spring.assembling.service.AnimalServiceImpl;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackageClasses = {Animal.class,AnimalServiceImpl.class})
@ComponentScan(basePackages = {"com.ccff.spring.assembling.pojo","com.ccff.spring.assembling.service","com.ccff.spring.assembling.controller"})
//@ComponentScan(basePackages = {"com.ccff.spring.assembling.pojo","com.ccff.spring.assembling.service","com.ccff.spring.assembling.controller"},basePackageClasses = {Animal.class,AnimalServiceImpl.class,AnimalController.class})
public class AnimalConfig {
}
