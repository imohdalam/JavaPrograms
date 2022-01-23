package com.datastructure;

public class gcd {

    private static int gcd(int a, int b) {
        int rem;
        int ans = 0;
        if (a > b) {
            while (a % b != 0) {
                rem = a % b;
                a = b;
                b = rem;
            }
            ans = b;
        }

        if (b > a) {
            while (b % a != 0) {
                rem = b % a;
                b = a;
                a = rem;
            }
            ans = a;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("gcd: " + gcd(42, 64));
    }
}
