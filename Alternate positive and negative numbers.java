class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int n = arr.size();
        ArrayList <Integer> pos = new ArrayList<>();
        ArrayList <Integer> neg = new ArrayList <>();
        for(int i = 0 ; i < n ; i++ ){
            if(arr.get (i) < 0){
                neg.add(arr.get(i));
            }
            else{
                pos.add(arr.get(i));
            }
        }
        ArrayList <Integer> newList = new ArrayList<>();
        int i = 0 ; int j = 0;
        while(i < pos.size() && j < neg.size()){
            newList.add(pos.get(i));
            i++;
            newList.add(neg.get(j));
            
            j++;
        }
        
        while(i < pos.size() ){
            newList.add(pos.get(i));
            i++;
        }
        while(j < neg.size() ){
            newList.add(neg.get(j));
            j++;
        }
        
        arr.clear();
        
        arr.addAll(newList);
        
    }
}
