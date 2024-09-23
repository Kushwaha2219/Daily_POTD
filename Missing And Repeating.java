class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        int[] res =new int[2];
        int n = arr.length;
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for(int i=1;i<=n;i++){
            if(map.containsKey(i)) {
                if(map.get(i)==2) {
                    res[0] = i;
                }
            }else{
                res[1] = i;
            }
        }
        return res;
    }
}
