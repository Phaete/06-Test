package com.phaete;

public class Challenges {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    /**
     * Returns the sum of two integers.
     *
     * @param  a	first integer to be added
     * @param  b	second integer to be added
     * @return  the sum of a and b
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Determines whether the given integer is even or not.
     *
     * @param  a	the integer to be checked
     * @return  true if the integer is even, false otherwise
     */
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    /**
     * Returns the product of two integers.
     *
     * @param  a	first integer to be multiplied
     * @param  b	second integer to be multiplied
     * @return  the product of a and b
     */
    public static int product(int a, int b) {
        return a * b;
    }

    /**
     * Returns the given string in upper case.
     *
     * @param  a  the string to be converted to upper case
     * @return  the given string in upper case
     */
    public static String toUpperCase(String a) {
        return a.toUpperCase();
    }

    /**
     * Determines whether the given integer is positive.
     * This method assumes that 0 is neither positive nor negative
     *
     * @param  a	the integer to be checked
     * @return  true if the integer is greater than zero, false otherwise
     */
    public static boolean isPositive(int a) {
        return a > 0;
    }
}
