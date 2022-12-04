package com.warren;

import java.math.BigInteger;

public class Main {
    /* Find the sum of all the multiples of nbr_a or nbr_b below max */
    // Problem 1
    public static int eulerOne(int max, int nbr_a, int nbr_b) {
        int sum = 0;
        for (int index = 0; index < max; index++) {
            if (index % nbr_a == 0 || index % nbr_b == 0) {
                sum += index;
            }
        }

        return sum;
    }

    /* By considering the terms in the Fibonacci sequence whose values do not exceed
     four million, this function finds the sum of the even-valued terms.
     */
    // problem 2
    public static int finonaciPairs(int first_term, int second_term, int n) {
        int sum = 0;
        int tmp;
        while (first_term <= n) {
            if (first_term % 2 == 0) {
                sum += first_term;
            }
            tmp = first_term + second_term;
            first_term = second_term;
            second_term = tmp;

        }
        return sum;
    }

    public static int factoriel(int n) {
        if (n == 1)
            return 1;
        else
            return n * factoriel(n - 1);
    }

    /*Sum square difference */
    // Problem 6
    public static int sumsquare(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static int squaresum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum * sum;
    }

    public static int problemSix(int x){
        return squaresum(x) - sumsquare(x);
    }

    // problem 20 sum digit of factorial result
    public static BigInteger factorial(BigInteger n){
        if(n.equals(new BigInteger("1")) || n.equals(new BigInteger("0")))
            return new BigInteger("1");
        return n.multiply(factorial(n.subtract(new BigInteger("1"))));
    }

    public static int sumDigitFactorial(String c){
        BigInteger cible = new BigInteger(c);
        BigInteger fact = factorial(cible);
        String chaine = fact.toString();
        int result = 0;
        for (int i = 0; i<chaine.length(); i++){
            result += chaine.charAt(i) - '0';
        }

        return result;
    }


    public static void main(String[] args) {
        int eul1;
        int eul2;
        int max = 1000, nbr_a = 3, nbr_b = 5;
        eul1 = eulerOne(max, nbr_a, nbr_b);
        eul2 = finonaciPairs(1, 2, 4000000);
        System.out.println("\n***********\n Problem 1\n" + "The sum of all multiples of " + nbr_a + " or " + nbr_b + "below " + max + " equals: " + eul1);
        System.out.println("***********\n Problem 2\n" + "sum pairs=" + eul2);
        System.out.println("***********\n Problem 6\n" + "the difference between the sum of the squares of the first\n " +
                "one hundred natural numbers and the square of the sum = " + problemSix(100));

        System.out.println("***********\n Problem 20\n" + "sum digit of factorial=" + sumDigitFactorial("100"));
    }
}

