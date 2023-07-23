package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {
    // define a Bean for Engine
    @Bean
    public Engine engine(){
        return new EngineImpl();
    }

    // define a Bean for Car, which uses the Engine Bean
    @Bean
    public Car car(){
        Car car = new Car();
        car.setEngine(engine());
        return car;
    }
}