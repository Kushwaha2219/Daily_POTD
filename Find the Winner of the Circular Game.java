class Solution {
    public int findTheWinner(int n, int k) {
        

        ArrayList <Integer> circle = new ArrayList<>();

        for(int i = 0; i < n; i++){
            circle.add(i+1);
        }
        int idx = 0 ; 
        while(circle.size()  > 1){

            int nxtToRemove = (idx + k - 1) % circle.size();
            circle.remove(nxtToRemove);

            idx = nxtToRemove;  
        }
        return circle.get(0);
    
    }
}
