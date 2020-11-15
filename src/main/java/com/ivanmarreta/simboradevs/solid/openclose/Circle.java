package com.ivanmarreta.simboradevs.solid.openclose;

public class Circle implements Shape{

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius;
    }
}
