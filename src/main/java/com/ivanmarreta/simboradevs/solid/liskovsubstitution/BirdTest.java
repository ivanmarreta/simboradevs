package com.ivanmarreta.simboradevs.solid.liskovsubstitution;

import java.util.Arrays;
import java.util.List;

public class BirdTest {

    public static void main(String[] args) {
        List<Bird> birds = Arrays.asList(new Crow(), new Parrot());
        birds.forEach(Bird::eat);

        BirdFlight bird = new Crow();

    }
}
