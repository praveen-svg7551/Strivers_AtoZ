package com.binarySearch.array1D;

public class Last_occurrence_in_a_sorted_array {
    static int[] occurrence1(int[] arr , int ele){
        int n = arr.length;
        int first = -1 , last = -1;
        for(int i=0 ; i<n ; i++){
            if(arr[i] == ele){
                 if(first == -1) {
                     first = i;
                     last = i;
                 }else{
                     last = i;
                 }
            }
        }

        return new int[] {first,last};
    }
    public static void main(String[] args) {
         int[] arr = {3, 4, 13, 13, 13, 20, 40};

        int[] ans = occurrence1(arr,13);

        for(int i: ans){
            System.out.print(i+" ");
        }
    }
}
