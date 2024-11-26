 int res[] = new int[n];
        int count = 0;
        int champ = -1;
        Arrays.fill(res,0);
        for(int edge[]: edges){
            int v = edge[1];

            res[v] += 1;
        }

        for(int i = 0 ; i < n ;i++){
            if(res[i] == 0) {
                champ = i;
                count++;
            }

            if(count > 1) return -1;
        }
        return champ;
