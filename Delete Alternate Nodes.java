class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        if(head == null || head.next == null) return;
        
        
        Node curr = head;
        while(curr != null && curr.next != null ){
            curr.next = curr.next.next;
            curr= curr.next;
        }
        
        
    }
}
