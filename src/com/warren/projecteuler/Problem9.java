package com.warren.projecteuler;

public class Problem9 {
    /*Problem description:
     * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
     * a^2 + b^2 = c^2
     * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
     * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     * Find the product abc.
     * */
    public static void specialPythagoreanTripletProduct(int sumTripletValue) {
        for (int a = 3; a < (sumTripletValue - 3) / 3; a++) {
            for (int b = a + 1; b < (sumTripletValue - 1 - a); b++) {
                int c = sumTripletValue - a - b;
                if (c * c == a * a + b * b) {
                    System.out.println(" Problem 9 : The product abc of pythagorean Triplet with a<b<c that the sum give "
                            + a + "+" + b + "+" + c + " = " + sumTripletValue + " is " + a * b * c);
                    System.out.println("***********************************************");
                }
            }
        }
    }
}
