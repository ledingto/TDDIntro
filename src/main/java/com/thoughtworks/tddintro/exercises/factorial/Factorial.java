package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        int factorial = 1;
        for(int j=i; j>0; j--) {
            factorial *= j;
        }
        return factorial;
    }
}
