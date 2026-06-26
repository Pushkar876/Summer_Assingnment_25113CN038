//Write a program to Merge arrays.

package Day17;

import java.util.Arrays;

public class program65 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6};
        int merged[] = new int[arr1.length + arr2.length];
        int index = 0;
        for(int i=0;i<arr1.length;i++){
            merged[index] = arr1[i];
            index++;

        }
        for(int i=0;i<arr2.length;i++){
            merged[index] = arr2[i];
            index++;
        }
        System.out.println(Arrays.toString(merged));
    }
    
}
