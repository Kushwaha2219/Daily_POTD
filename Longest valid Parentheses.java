class Solution{
    static int maxLength(String S){
        
        
        int open = 0, close = 0, maxCount = 0;
        
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                open++;  
            } else {
                close++;  
            }
            
            if (open == close) {
                
                maxCount = Math.max(maxCount, 2 * close);
            } else if (close > open) {
                
                open = close = 0;
            }
        }
        
       
        open = close = 0;
        
        
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            
            if (open == close) {
                maxCount = Math.max(maxCount, 2 * open);
            } else if (open > close) {
                
                open = close = 0;
            }
        }
        
        return maxCount;
    }
}
