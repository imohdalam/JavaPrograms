package com.company;

public class Main {

    static int sumAllNumber(int ... x)
    {
        int sum =0;
        for(int i=0; i<x.length; i++)
        {
            sum = sum + x[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum: "+sumAllNumber(5,-8,9,6,4,9,0));
    }
}
