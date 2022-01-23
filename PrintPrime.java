package com.datastructure;

public class PrintPrime {

    static int i = 2;
    static int count = 0;

    private static void display(int n) {
        CheckPrime checkPrime = new CheckPrime();
        System.out.print("Prime Number upto " + n + " : ");
        while (i <= n) {
            if (checkPrime.isPrime(i)) {
                System.out.print(" " + i);
                count++;
            }
            i++;
        }
        System.out.println("\nTotal Number of Prime Number upto " + n + " : " + count);
    }

    public static void main(String[] args) {
        display(2);

    }
}
