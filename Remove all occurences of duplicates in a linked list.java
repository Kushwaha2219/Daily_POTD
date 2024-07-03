class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
        Node dummy = new Node(0);
        dummy.next = head;
        Node temp = head;
        Node prev = dummy;
        while(temp!=null){
            boolean dp = false;
            while(temp.next != null && temp.data == temp.next.data){
                temp = temp.next;
                dp = true;
                
           
            }
            if(dp){
                prev.next = temp.next;
            }
            else{
                prev = temp;
            }
            
            
            temp = temp.next;
            
        }
        return dummy.next;
    }
}
