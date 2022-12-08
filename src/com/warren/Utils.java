package com.warren;

import java.math.BigInteger;

public class Utils {

    public static BigInteger factorial(int n) {
        if (n == 1 || n == 0)
            return BigInteger.valueOf(1);
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }

    public static boolean isPrime(int n){
        if(n<=0 || n==1){
            return false;
        }
        else{
            for (int i = 2; i < n; i++){
                if (n % i == 0)
                    return false;
            }
        }
        return  true;
    }
}
