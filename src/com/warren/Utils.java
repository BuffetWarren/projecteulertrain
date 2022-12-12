package com.warren;

import java.math.BigInteger;

public class Utils {

    public static BigInteger factorial(int n) {
        if (n == 1 || n == 0)
            return BigInteger.valueOf(1);
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static BigInteger fibonacci(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        } else if (n == 1) {
            return BigInteger.ONE;
        } else {
            return fibonacci(n - 1).add(fibonacci(n - 2));
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        // Check if n=2 or n=3
        if (n == 2 || n == 3)
            return true;

        // Check whether n is divisible by 2 or 3
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        // Check from 5 to square root of n
        // Iterate i by (i+6)
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
