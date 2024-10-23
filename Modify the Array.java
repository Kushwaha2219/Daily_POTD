/*
Given an array arr. Return the modified array in such a way that if the current and next numbers are valid numbers and are equal then 
double the current number value and replace the next number with 0. After the modification, rearrange the array such that all 0's are shifted to the end.

Note:
Assume ‘0’ as the invalid number and all others as a valid number.
The sequence of the valid numbers is present in the same order.
*/

class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        ArrayList <Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] == 0){
                continue;
            }else{
                if(arr[i] == arr[i+1]){
                    arr[i] = arr[i] * 2;
                    
                    arr[i+1] = 0;
                }
            }
        }
        int c = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                list.add(arr[i]);
                c++;
            }
            
        }
        while(c < arr.length){
            list.add(0);
            c++;
        }
        return list;
    }
}
