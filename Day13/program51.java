//Write a program to Find largest and smallest element.

package Day13;
import java.util.Scanner;

public class program51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        
        int n = scanner.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<arr.length;i++){
            System.out.printf("Enter element at arr[%d]: ",i);
            arr[i] = scanner.nextInt();
        }
       
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();

        int largest = arr[0];
        int smallest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
            for(int i=0;i<arr.length;i++){
                if(arr[i]<smallest){
                    smallest = arr[i];
                }
            }
            
             
        
        System.out.printf("The largest element is %d\n",largest);
        System.out.printf("The smallest element is %d",smallest);

        
         scanner.close();
    }
}
