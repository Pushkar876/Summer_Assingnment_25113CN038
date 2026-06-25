// Write a program to Find sum and average of array.

package Day13;
import java.util.Scanner;

public class program50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            System.out.printf("Enter element at arr[%d]: ",i);
            arr[i] = scanner.nextInt();
        }
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
            
        }
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            
        }
        System.out.println(sum);
        int average = sum / arr.length;
        System.out.println(average);
        

        scanner.close();
    }
    
}
