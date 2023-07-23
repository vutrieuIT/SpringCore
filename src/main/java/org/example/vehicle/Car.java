package org.example.vehicle;

import org.example.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private Engine engine;

    @Autowired
    public Car(Engine engine){
        this.engine = engine;
    }

    public void startCar(){
        System.out.print("Car: ");
        engine.start();
    }
}
