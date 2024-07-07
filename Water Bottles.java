class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int maxBottles = 0;
        int totalEmptyBottles = 0;
        int bottlesToBeExchange = 0 ;
        int bottlesLeft = 0 ; 


        while(numBottles  > 0){
            maxBottles += numBottles ;
            totalEmptyBottles = numBottles + bottlesLeft;
            bottlesToBeExchange = totalEmptyBottles / numExchange;
            bottlesLeft = totalEmptyBottles % numExchange ; 

            numBottles = bottlesToBeExchange;
        }
        return maxBottles;
    }
}
