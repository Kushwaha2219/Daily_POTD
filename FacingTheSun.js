class Solution {
    // Returns count buildings that can see sunlight
    countBuildings(height) {
        // code here
        
        let count = 1 ;
        let maxNum = height[0];
        
        for( let i = 1 ; i < height.length ; i++){
            if(height[i] > maxNum){
                maxNum = height[i];
                count++;
            }
        }
        return count;
    }
}
