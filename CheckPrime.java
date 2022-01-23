package com.datastructure;

public class CheckPrime {

    static int i = 2;

    public static boolean isPrime(int n) {
        if (n <= 2) {
            i = 2;
            return n == 2;
        }
        if (n == i) {
            i = 2;
            return true;
        }
        if (n % i == 0) {
            i = 2;
            return false;
        }
        i++;
        return isPrime(n);
    }

    public static void main(String[] args) {
        System.out.println("isPrime: " + isPrime(33));
    }
}
