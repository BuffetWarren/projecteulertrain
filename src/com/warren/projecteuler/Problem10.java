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
        for (BigInteger i = BigInteger.TWO; i.compareTo(BigInteger.valueOf(number)) <= 0; i = i.add(BigInteger.ONE)){
            if (Utils.isPrime(i.intValue())){
                result = result.add(i);
            }
        }

        System.out.println("Problem 10 : The sum of all the primes below to "+number+" is : "+result);
        System.out.println("***********************************************");
    }
}
