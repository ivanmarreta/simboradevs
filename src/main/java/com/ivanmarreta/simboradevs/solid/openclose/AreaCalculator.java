package com.ivanmarreta.simboradevs.solid.openclose;

import java.util.Arrays;
import java.util.List;

public class AreaCalculator {

    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(2), new Rectangle(1, 1), new Petagon());
        shapes.forEach(Shape::calculateArea);
    }
}
