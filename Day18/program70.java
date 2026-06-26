//Write a program to Selection sort.

package Day18;

import java.util.Arrays;

public class program70 {
     public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void SelectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                swap(arr,i,min);
            }

        }
    }



    public static void main(String[] args) {
        int arr[] = {5,4,3,21,34};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    
    
}
