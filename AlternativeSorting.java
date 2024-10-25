/*
Given an array arr of distinct integers. Rearrange the array in such a way that the first element is the largest and the second element is the smallest, the third element is the second largest and the fourth element is the second smallest, and so on.

Examples:

Input: arr[] = [7, 1, 2, 3, 4, 5, 6]
Output: [7, 1, 6, 2, 5, 3, 4]
  */
class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
        
        ArrayList <Integer> list = new ArrayList<>();
        int n = arr.length;
        int mid = n/2;
        
        Arrays.sort(arr);
        for(int i = 0 ; i < mid ; i++){
            list.add(arr[n-i-1]);
            list.add(arr[i]);
        }
        if (n % 2 != 0) {
            list.add(arr[n / 2]);
        }
        return list;
    }
}
