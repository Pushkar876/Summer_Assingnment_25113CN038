//Write a program to Input and display array.


package Day13;
import java.util.Scanner;

public class program49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements of array: ");
       
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.printf("Enter element at arr[%d]: ",i);
            arr[i] = scanner.nextInt();
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
    
}
