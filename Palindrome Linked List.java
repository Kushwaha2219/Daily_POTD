class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
           // Your code here
           Stack <Integer> st = new Stack<>();
           Node temp = head;
           while(temp!=null){
               st.push(temp.data);
               temp = temp.next;
           }
           temp = head;
           while(!st.isEmpty()){
               if(st.pop() != temp.data){
                   return false;
               }
               temp = temp.next;
           }
           return st.isEmpty();
    }
}
