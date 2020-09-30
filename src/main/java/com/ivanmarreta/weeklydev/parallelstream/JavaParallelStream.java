package com.ivanmarreta.weeklydev.parallelstream;

import java.util.Arrays;
import java.util.List;

public class JavaParallelStream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //find total of triple of odd numbers
        int total = 0;

        for (int i : numbers) {
            if(i % 2 != 0){
                total += i*3;
            }
        }

        System.out.println(total);
    }
}
