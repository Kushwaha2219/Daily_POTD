class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        HashSet <Integer> hs = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < a.length ; i++){
            hs.add(a[i]);
        }
        for(int i = 0 ; i < b.length ; i++){
            hs.add(b[i]);
        }
        
        for(int num : hs){
            list.add(num);
        }
        Collections.sort(list);
        return list;
    }
}
