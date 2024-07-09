class Solution {
    public double averageWaitingTime(int[][] customers) {
        
        double waitingTime = 0;
        double finishingTime = 0;
        double arrivalTime = 0;
        double sum = 0;
        for(int i = 0 ; i < customers.length ; i++){
            arrivalTime = customers[i][0];
            finishingTime = Math.max(arrivalTime,finishingTime) + customers[i][1];
            waitingTime = finishingTime - arrivalTime;

            sum+=waitingTime;

        }
        double avgWaitingTime = (double)sum/customers.length;
        return avgWaitingTime;

    }
}
