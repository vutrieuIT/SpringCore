package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private Engine engine;

    @Autowired
    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public void startCar(){
        engine.start();
    }
}
