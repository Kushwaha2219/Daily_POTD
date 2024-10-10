class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        int n = arr.length;
        int maxLen = 0;
        HashMap <Integer, Integer> hm = new HashMap();
        for(int i = 0 ; i < n ; i++){
            if(hm.containsKey(arr[i])){
                maxLen = Math.max(maxLen, i - hm.get(arr[i]));
            }
            else{
                hm.put(arr[i],i);
            }
        }
        return maxLen;
    }
}
