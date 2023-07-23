package org.example;

import org.springframework.stereotype.Component;

public class EngineImpl implements Engine{

    @Override
    public void start() {
        System.out.println("Engine started");
    }
}
