package com.warren.projecteuler;

import com.warren.Utils;

import java.math.BigInteger;

public class Problem10 {
    /*Description:
    * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
    * Find the sum of all the primes below two million.
    * */

    public static void sumOfPrimeNumbersBelow(int number){
        BigInteger result = BigInteger.ZERO;
        for (int i = 2; i <= number; i++){
            if (Utils.isPrime(i)){
                result = result.add(BigInteger.valueOf(i));
            }
        }

        System.out.println("Problem 10 : The sum of all the primes below to "+number+" is : "+result);
        System.out.println("***********************************************");
    }
}
