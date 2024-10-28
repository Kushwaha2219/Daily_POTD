class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        
        HashSet <Integer> hm = new HashSet<>();
        int n = arr.length;
        ArrayList <Integer> res = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            if(hm.contains(arr[i])){
                continue;
            }else{
                hm.add(arr[i]);
                res.add(arr[i]);
            }
        }
        return res;
    }
}
