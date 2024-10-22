class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        // write code here
        
        HashMap <Integer,Integer> freq = new HashMap<>();
        // int freq0 = 1;
        // int freq1 = 0;
        int counter = 0 ;
        int res = 0;
        freq.put(0,1);
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                counter += 1;
            }
            else if(arr[i] == y){
                counter -= 1;
            }
            
            
            if (freq.containsKey(counter)) {
                res += freq.get(counter);
                freq.put(counter, freq.get(counter) + 1);
            } 
            else {
                freq.put(counter, 1);
            }
        }
        return res;
    }
}
