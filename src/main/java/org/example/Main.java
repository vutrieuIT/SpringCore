package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // load Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get Car bean from the Spring container
        Car car = context.getBean("car", Car.class);

        // start car
        car.startCar();
    }
}