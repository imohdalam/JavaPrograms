package com.datastructure;

public class fibonacci {
    private static void display(int n){
        int a=0, b=1, c =a+b;
        System.out.print(" "+a+" "+b);
        while (c<n) {
            System.out.print(" "+c);
            c = a+b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        display(25);
    }
}
