class Solution {
    static int minJumps(int[] arr) {
        // your code here
        
        if(arr.length<=1 ) return 0;
        if(arr[0] == 0) return -1;
        int dis = Integer.MIN_VALUE;
        int jump = 0;
        int end = 0;
        for(int i = 0 ; i < arr.length-1 ; i++){
            
            dis = Math.max(dis, i + arr[i]);
            
            if(i == end){
                
                jump++;
                
                end = dis;
                
                
                if(dis <=i) return -1;
            }
        }
    return jump; 
    }
}
