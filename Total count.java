class Solution {
    int help(int k, int num) {
        return (num + k - 1) / k; 
    }
    int totalCount(int k, int[] arr) {
        // code here
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int out = help(k, arr[i]);
            sum+=out;
        }
    return sum;
    }
}
