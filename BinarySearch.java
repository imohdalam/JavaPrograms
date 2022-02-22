package com.searching;

public class BinarySearch {

    // Iterative Method
   /* private static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==key)
                return mid;
            else if (arr[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }*/

    // Recursive Method
    private static int binarySearch(int[] arr, int start, int end, int key){
        if (start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==key)
                return mid;
            else if (arr[mid] > key)
                return binarySearch(arr,start,mid - 1, key);
            else
                return binarySearch(arr, mid + 1, end, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,8,19,24,26,34,35,37,38,45,65,75,162,420};
        int key = 420;
        int result = binarySearch(arr,0, arr.length - 1, key);
        if(result!=-1)
          System.out.println("Found at index"+"["+result+"]");
        else
            System.out.println("NOT Found");
    }
}
