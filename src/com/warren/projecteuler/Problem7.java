package com.warren.projecteuler;

public class Problem7 {
    /*Description:
    * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    * We are find the 10 001st prime number
    * */

    // Check is number n is prime
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0)
                return false;
        }
        return  true;

    }

    // Find the Prime number at the position "position"
    public static void firstPrimeNumber(int positionValue){
        int primeCounter = 0;
        int number = 2;
        while (primeCounter != positionValue){
            if (isPrime(number)){
                primeCounter++;
                //System.out.println(number +" is prime");
            }
            number++;
        }
        int result = number -1;
        System.out.println("Problem 7 : the "+positionValue+" st number is : "+result);
        System.out.println("***********************************************");
    }
}
