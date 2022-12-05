package com.warren.projecteuler;

public class Problem1 {
    /**
     *  Problem Description : If we list all the natural numbers below 10 that are multiples of 3 or 5,
     *  we get 3, 5, 6 and 9. The sum of these multiples is 23.
     *
     * Find the sum of all the multiples of 3 or 5 below 1000.
     *
     *  */
    public static void sumOfMultiples(int firstNumber, int secondNumber, int multiplesMaxValue) {
        int sum = 0;
        for (int i = 0; i < multiplesMaxValue; i++) {
            if (i % firstNumber == 0 || i % secondNumber == 0) {
                sum += i;
            }
        }

        System.out.println("Problem 1 : The sum of all multiples of " + firstNumber + " or " + secondNumber + "below " + multiplesMaxValue + " is equal to : " + sum);
        System.out.println("***********************************************");
    }
}
