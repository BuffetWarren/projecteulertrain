package com.warren.projecteuler;

import java.math.BigInteger;

public class Problem10 {
    /*Description:
    * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
    * Find the sum of all the primes below two million.
    * */

    public static void sumPrimeBelowTo(int maxValueBelow) {

        BigInteger sumPrimeNumber = BigInteger.valueOf(0);
        for (int number = 2; number <= maxValueBelow; number++){
            if (Problem7.isPrime(number)){
                sumPrimeNumber = sumPrimeNumber.add(BigInteger.valueOf(number));
            }
        }

        System.out.println("Problem 10 : The sum of all the primes below to "+maxValueBelow+" is : "+sumPrimeNumber);
        System.out.println("***********************************************");
    }
}
