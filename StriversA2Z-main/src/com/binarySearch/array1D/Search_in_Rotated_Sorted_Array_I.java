package com.binarySearch.array1D;

public class Search_in_Rotated_Sorted_Array_I {
    static int rotatedSearch(int[] arr , int key,int low , int high){

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == key) return mid;
            else if(arr[mid]>arr[low]){//sorted left
                if(key>=arr[low] && key <= arr[mid]) high = mid-1;
                else low = low+1;
            }else{//sorted right
                if(key >= arr[mid] && key <= arr[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int[] arr  = {4, 5, 6, 7, 0, 1, 2};
       int n= arr.length;
       int k = 0;
       System.out.println(rotatedSearch(arr, k,0,n-1));
    }
}
