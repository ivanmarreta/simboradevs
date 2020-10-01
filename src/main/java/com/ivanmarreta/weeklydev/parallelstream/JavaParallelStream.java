package com.ivanmarreta.weeklydev.parallelstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaParallelStream {

    public static void main(String[] args) {
        //Java Streams

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        use(numbers.parallelStream());
    }

    public static void use(Stream<Integer> stream){
        stream
            .filter(i -> filter(i))
            .map(i -> transform(i))
            .forEachOrdered(i -> printIt(i));
    }

    public static boolean filter(int number) {
        System.out.println("filter: " + number + " -- " + Thread.currentThread());
        return true;
    }

    public static int transform(int number) {
        System.out.println("map: " + number + " -- " + Thread.currentThread());
        sleep(1000);
        return 1 * number;
    }

    public static void printIt(int number){
        System.out.println("print: " + number + " -- " + Thread.currentThread());
    }

    public static void sleep(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("ERROR");
        }
    }
}
