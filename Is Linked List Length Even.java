class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        int count = 0 ;
        while(head != null){
            count++;
            head = head.next;
        }
        
        return true ? count % 2 == 0 : false;
    }
