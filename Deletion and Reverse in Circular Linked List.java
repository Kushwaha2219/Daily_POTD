class Solution {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        // code here
        Node prev = head;
        Node curr = head.next;
        Node temp = null;
        while(curr != head){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        curr.next = prev;
        return prev;
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        // code here
        Node temp = head.next;
        Node prev = head;
         if (head == null) return null;
        if(head.data == key){
            while(temp!=head){
                prev = temp;
                temp = temp.next;
            }
        }
        else{
            while(temp!=head && temp.data != key ){
                prev = temp;
                temp = temp.next;
            }
        }
        
        
        if(head.data == key || head != temp){
            prev.next = temp.next;
        }
        return head.data == key ? prev.next : head;
    }
}
