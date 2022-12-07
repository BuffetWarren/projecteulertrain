package com.warren;

import java.math.BigInteger;

public class Utils {
    public static BigInteger factorial(int n) {
        if (n == 1 || n == 0)
            return BigInteger.valueOf(1);
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }
}
