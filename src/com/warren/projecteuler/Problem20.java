package com.warren.projecteuler;

import java.math.BigInteger;

public class Problem20 {
    /**
     * Problem Description : n! means n × (n − 1) × ... × 3 × 2 × 1
     * <p>
     * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
     * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
     * <p>
     * Find the sum of the digits in the number 100!
     */
    public static void sumOfDigitsInFactorialOf(String number) {
        BigInteger fact = factorial(new BigInteger(number));
        String numberStringValue = fact.toString();
        int result = 0;
        for (int i = 0; i < numberStringValue.length(); i++) {
            result += Character.getNumericValue(numberStringValue.charAt(i));
        }

        System.out.println("Problem 20 : The sum of the digits in the number " + number + "! is : " + result);
        System.out.println("***********************************************");
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(new BigInteger("1")) || n.equals(new BigInteger("0")))
            return new BigInteger("1");
        return n.multiply(factorial(n.subtract(new BigInteger("1"))));
    }
}
