package Sorting;

import java.util.Scanner;

class Quick{
    int quick(int arr[],int l,int r){
        int p=arr[l];
        int i=l;
        int j=r;
        while (i<j && i< arr.length){
            while (arr[i]<=p) i++;
            while (arr[j]>p) j--;
            int temp;
            if(i<j){
                temp = arr[i];
                arr[i]=arr[j];
            }
            else{
                temp = arr[l];
                arr[l]=arr[j];
            }
            arr[j]=temp;
        }
        return  j;
    }
    void quickSort(int arr[],int l,int r){
        if(l<r){
            int pi=quick(arr,l,r);
            quickSort(arr,l,pi-1);
            quickSort(arr,pi+1,r);
        }
    }
}

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Welcome to the Quicksort----");
        System.out.println("Enter Number of terms: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Any "+n+" No: ");
        for(int i=0;i<n;i++)
             arr[i] = sc.nextInt();

        Quick q= new Quick();
        q.quickSort(arr,0,n-1);
        System.out.print("Sorted Array: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+", ");
        }
    }
}
