class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String arr[] = str.split("\\.");
        String s = "";
        for(int i = arr.length-1;i >=0 ; i--){
            s+=arr[i];
            
            if(i>0) s+=".";
        }
        return s;
    }
}
