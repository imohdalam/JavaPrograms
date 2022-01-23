package com.datastructure;

public class FibonacciMember {
    private static String isMember(int n){
        String flag = "No";
        int a = 0, b = 1, c = a+b;
        while(c<=n || n==0 || n==1){
            if(c==n || n==0) {
                flag = "Yes";
                return flag;
            }
            a = b;
            b = c;
            c = a+ b;
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println("Is Member: "+isMember(34));
    }
}
