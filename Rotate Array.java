class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    
    static int[] reverse(int arr[], int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
            
            
        }
        return arr;
    }
    static void rotateArr(int arr[], int d) {
        d = d % arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        
    }
}
