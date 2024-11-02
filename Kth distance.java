/*
Given an unsorted array arr and a number k which is smaller than the size of the array. Return true if the array contains any duplicate within k distance throughout the array else false.
*/

class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        HashMap <Integer,Integer> hm = new HashMap<>();
        int n = arr.length;
        
        for(int i = 0 ; i < n ; i++){
            if(hm.containsKey(arr[i])){
                int diff = i - hm.get(arr[i]);
                
                if(diff <= k) return true;
            }else{
                hm.put(arr[i],i);
            }
        }
        return false;
    }
}
