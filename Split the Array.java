class Solution {

    public static int countgroup(int arr[]) {
        // Complete the function
        int n = arr.length;
        int res = 1;
        int mod = 1000000007;
        int xor = 0;
        for(int i = 0 ; i < n ; i++){
            xor = xor ^ arr[i];
        }
        if(xor!=0) return 0;
        else{
            for(int i = 0 ; i < n-1 ; i++){
                res = (res * 2)% mod;
            }
        }
        return res - 1;
    }
}
