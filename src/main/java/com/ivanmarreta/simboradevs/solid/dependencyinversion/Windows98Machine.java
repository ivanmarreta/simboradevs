package com.ivanmarreta.simboradevs.solid.dependencyinversion;

public class Windows98Machine {

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    //... getKey...
}
