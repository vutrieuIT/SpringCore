package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring configuration from the AppConfig class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // get Car bean from the Spring container
        Car car = context.getBean(Car.class);

        // start car
        car.startCar();
    }
}