PriorityQueue<Integer> que = new PriorityQueue<>();
        int j = 0 ;
        
        for(int i = 0 ; i < arr.length ; i++){
            que.add(arr[i]);
            if(i>=k){
                arr[j++] = que.poll();
            }
        }
        while(!que.isEmpty()){
            arr[j++] = que.poll();
        }
