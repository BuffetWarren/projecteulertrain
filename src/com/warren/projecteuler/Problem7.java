package com.warren.projecteuler;

import com.warren.Utils;

public class Problem7 {
    /**
     * Description:
     * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
     * We are find the 10 001st prime number
     */


    // Find the Prime number at the position "position"
    public static void firstPrimeNumber(int position) {
        int primeCounter = 0;
        int number = 2;
        while (primeCounter != position) {
            if (Utils.isPrime(number)) {
                primeCounter++;
            }
            number++;
        }
        int result = number - 1;
        System.out.println("Problem 7 : the " + position + " st prime number is : " + result);
        System.out.println("***********************************************");
    }
}
