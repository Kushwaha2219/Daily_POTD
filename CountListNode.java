class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int sz = 0;
        while(head != null){
            sz++;
            head = head.next;
        }
        return sz;
    }
}
