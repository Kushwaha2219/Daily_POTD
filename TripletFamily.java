/*
Given an array arr of integers. Find whether three numbers are such that the sum of two elements equals the third element.

Example:

Input: arr[] = [1, 2, 3, 4, 5]
Output: true
Explanation: The pair (1, 2) sums to 3

*/


public int helper(int[]arr,int key){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key) return 1;
        }
        return 0;
    }
    public boolean findTriplet(int[] arr) {
        int sum = 0;
        int res = 0;
        for(int i = 0 ; i < arr.length-1; i++){
            for(int j = i+1 ; j < arr.length ;j++){
                 sum=arr[i]+arr[j];
                 res = helper(arr,sum);
                 if(res == 1) return true;
            }
        }
        return false;
    }
