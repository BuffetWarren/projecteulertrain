package com.warren.projecteuler;

public class Problem6 {
    /**
     * Problem Description : The sum of the squares of the first ten natural numbers is :
     *
     * 1^2 + 2^2 + ... + 10^2 = 385
     *
     * The square of the sum of the first ten natural numbers is :
     * <p>
     * (1 + 2 + ... + 10)^2 = 55^2 = 3025
     * <p>
     * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
     * <p>
     * 3025 - 385 = 2640
     * <p>
     * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     */
    public static void sumOfSquaresAndSquareOfSumDifference(int numberOfFirstNaturalNumber) {
        int result = squareOfSum(numberOfFirstNaturalNumber) - sumOfSquare(numberOfFirstNaturalNumber);

        System.out.println("Problem 6 : The difference between the sum of the squares of the first " +
                numberOfFirstNaturalNumber + " natural numbers and the square of the sum is : " + result);
        System.out.println("***********************************************");
    }

    private static int sumOfSquare(int numberOfFirstNaturalNumber) {
        int sum = 0;
        for (int i = 0; i <= numberOfFirstNaturalNumber; i++) {
            sum += i * i;
        }
        return sum;
    }

    private static int squareOfSum(int numberOfFirstNaturalNumber) {
        int sum = 0;
        for (int i = 0; i <= numberOfFirstNaturalNumber; i++) {
            sum += i;
        }
        return sum * sum;
    }
}
