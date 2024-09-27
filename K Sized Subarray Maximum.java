class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Your code here
        int n = arr.length;
        ArrayList <Integer> list = new ArrayList<>();
        Deque <Integer> dq= new ArrayDeque();
        for(int i = 0 ; i < k ; i++ ){
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        list.add(arr[(dq.peekFirst())]);
        for(int i = k ; i < n ; i++ ){
            if(dq.peekFirst() <=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            list.add(arr[(dq.peekFirst())]);
            
        }
        return list;
    }
}
