class Solution {
    public void markGuarded(int row, int col , int[][] arr){
        //up
        for(int i = row - 1; i >=0 ; i--){
            if(arr[i][col] == 2 || arr[i][col] == 3){
                break;
            }
            arr[i][col] = 1;
        }
        //down
        for(int i = row + 1; i < arr.length; i++){
            if(arr[i][col] == 2 || arr[i][col] == 3){
                break;
            }
            arr[i][col] = 1;
        }
        // left

        for(int i = col - 1; i >= 0; i--){
            if(arr[row][i] == 2 || arr[row][i] == 3){
                break;
            }
            arr[row][i] = 1;
        }

        //right
        for(int i = col + 1; i < arr[0].length; i++){
            if(arr[row][i] == 2 || arr[row][i] == 3){
                break;
            }
            arr[row][i] = 1;
        }
    }
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        
        int dp[][] = new int[m][n];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n; j++){
                dp[i][j] = 0;
            }
        }
        //marking guards
        for(int guard[] : guards){
            int i = guard[0];
            int j = guard[1];

            dp[i][j] = 2; // 2 as guard
        }
        //marking walls
        for(int wall[] : walls){
            int i = wall[0];
            int j = wall[1];

            dp[i][j] = 3; // 3 as wall
        }
        for(int guard[]: guards){
            int i = guard[0];
            int j = guard[1];
            markGuarded(i,j,dp);
        }

        int count = 0;
        for(int i = 0 ; i < m; i++){
            for(int j = 0 ;j < n ; j++){
                if(dp[i][j] == 0) count++;
            }
        }
        return count;
    }
}
