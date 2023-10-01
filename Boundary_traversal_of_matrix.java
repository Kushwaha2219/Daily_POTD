class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here
        int i;
       ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
        for(i=0;i<m;i++){
            arr1.add(matrix[0][i]);
        }
        for(i=1;i<n;i++){
            arr1.add(matrix[i][m-1]);
        }
        if(n>1) for(i=m-2;i>=0;i--){
            arr1.add(matrix[n-1][i]);
        }
        if(m>1) for(i=n-2;i>0;i--){
            arr1.add(matrix[i][0]);
        }
        
        return arr1;
    }
    
}
