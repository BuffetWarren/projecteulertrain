package com.warren;

import com.warren.projecteuler.Problem1;
import com.warren.projecteuler.Problem2;
import com.warren.projecteuler.Problem20;
import com.warren.projecteuler.Problem6;
import com.warren.projecteuler.Problem9;

public class Main {
    public static void main(String[] args) {
        Problem1.sumOfMultiples(3, 5, 1000);
        Problem2.sumOfEvenValuedFibonacciTerms(1,2, 4000000);
        Problem6.sumOfSquaresAndSquareOfSumDifference(100);
        Problem9.specialPythagoreanTripletProduct(1000);
        Problem20.sumOfDigitsInFactorialOf(100);
    }
}

