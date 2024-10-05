class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        int target = 1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] <= target){
                target+=arr[i];
            }
        }
        return target;
    }
}
