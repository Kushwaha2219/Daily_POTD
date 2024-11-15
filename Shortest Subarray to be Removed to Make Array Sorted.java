class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i < n - 1 && arr[i] <= arr[i + 1]) {
            i++;
        }
        if (i == n - 1) {
            return 0;
        }
        int j = n - 1;
        while (j > i && arr[j] >= arr[j - 1]) {
            j--;
        }
        int delete = Math.min(n - i - 1, j);

        int left = 0 , right = j;
        while(left <= i && right < n){
            if(arr[left] <= arr[right]){
                delete = Math.min(delete,right - left - 1);
                left++;
            }
            else{
                right++;
            }
        }
        return delete;
    }
}
