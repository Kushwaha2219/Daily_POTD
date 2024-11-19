void reverse (int arr[] , int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
    }
    void nextPermutation(int[] arr) {
        // code here
        int ind = -1;
        int n = arr.length;
        for(int i = n-2 ; i >= 0 ; i--){
            if(arr[i] < arr[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(arr,0,n-1);
            return;
        } 
        
        for(int i = n - 1; i >= ind ; i--){
            if(arr[ind] < arr[i]){
                int temp = arr[ind];
                arr[ind] = arr[i];
                arr[i] = temp;
                
                break;
            }
        }
        
        reverse(arr,ind+1 , n -1);
    }
