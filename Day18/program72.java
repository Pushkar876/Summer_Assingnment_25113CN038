//Write a program to Sort array in descending order

package Day18;

import java.util.Arrays;

public class program72 {
    public static void main(String[] args) {

        int arr[] = {13,45,22,56,28,34};

        for(int i = 0; i < arr.length - 1; i++) {

            for(int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}