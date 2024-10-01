class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        
        long n1 = 0;
        while(first!=null){
            n1 = (n1 * 10) + first.data;
            first = first.next;
        }
        long n2 = 0;
        while(second!=null){
            n2 = (n2 * 10) + second.data;
            second = second.next;
        }
        return (n1 * n2)%1000000007;
    }
}
