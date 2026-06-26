//Write a program to Linear search.

package Day14;

import java.util.Scanner;

public class program53{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int arr[] = {22,34,56,78,55};
        int target;
        int position = 0;
        boolean Isfound = false;
        System.out.print("Enter the element which is needed to be searched: ");
        target = scanner.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                Isfound = true;
                position = i;
                break;
            }else{
                 Isfound = false;
            }
        
        }
        if(Isfound){
            System.out.printf("The element exist in the array at index %d ",position);
        }
        if(!Isfound){
            System.out.println("The element does  not exist in the array.");
        }

        scanner.close();
    }
}