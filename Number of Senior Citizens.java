class Solution {
    public int countSeniors(String[] details) {
        
        int count = 0;
        for(String detail : details){
            int str1 = detail.charAt(11)-'0';
            int str2 = detail.charAt(12)-'0';
            
            int num = str1*10 + str2;
            if(num > 60){
                count++;
            }
        }
        return count;
    }
}
