class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int uppersum=0,bottomsum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=j){
                    uppersum+=matrix[i][j];
                }
                if(i>=j){
                    bottomsum+=matrix[i][j];
                }
            }
        }
        list.add(uppersum);
        list.add(bottomsum);
        return list;
    }
    
}
