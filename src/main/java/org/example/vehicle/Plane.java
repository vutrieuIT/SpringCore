package org.example.vehicle;

import org.example.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Plane {

    @Autowired
    private Engine engine;

    public void startPlane(){
        System.out.println("Plane: ");
        engine.start();
    }
}
