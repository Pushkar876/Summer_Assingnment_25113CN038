//Write a program to Bubble sort.

package Day18;

import java.util.Arrays;

public class program69 {
     public static void BubbleSort(int arr[]){
        boolean IsSwap = false;
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                     IsSwap = true;
                }
                if(!IsSwap){
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {5,2,6,3,1};
        
        BubbleSort(arr);
        
        System.out.println(Arrays.toString(arr));
        
    }
}
