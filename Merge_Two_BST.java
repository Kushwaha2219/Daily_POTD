class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> inorder(Node root, ArrayList<Integer>list){
        if(root!=null){
            inorder(root.left,list);
            list.add(root.data);
            inorder(root.right,list);
        }
        
        return list;
    }
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        ArrayList <Integer> list = new ArrayList<>();
        
        inorder(root1,list);
        inorder(root2,list);
        Collections.sort(list);
        return list;
    }
}
