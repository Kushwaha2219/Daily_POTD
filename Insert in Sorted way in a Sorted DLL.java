class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node temp = null;
        Node curr = head;
        Node newNode = new Node(x);
        if(head == null){
            return newNode;
        }
        while(curr != null && curr.data <= x){
            temp = curr;
            curr = curr.next;
        }
        if (curr == null) {
            temp.next = newNode;
            newNode.prev = temp;
        }else if(temp == null){
            newNode.next = curr;
            curr.prev = newNode;
            head = newNode;
        }
        else{
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = curr;
            curr.prev = newNode;
        } 
        
        
        return head;
    }
}
