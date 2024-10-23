
class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        int count = 0 , sz = 0; 
        int sum = 0;
        Node temp = head;
        Node curr = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        while(sz != count-n ){
            sz++;
            curr = curr.next;
        }
        while(curr != null){
            sum+=curr.data;
            curr = curr.next;
        }
        return sum;
    }
}
