// Write a program to Count even and odd elements.

package Day13;
import java.util.Scanner;

public class program52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.printf("Enter elemnt at arr[%d]: ",i);
            arr[i] = scanner.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        
        int countOfEven = 0;
        int countOfOdd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0)
                countOfEven++;
        else{
            countOfOdd++;
        }
    }
        System.out.printf("The number of even elements is %d\n ",countOfEven);
        System.out.printf("The number of odd elements is %d ", countOfOdd);

        scanner.close();
    }

    
}
