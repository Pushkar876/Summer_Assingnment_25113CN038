//Write a program to Rotate array left.

package Day15;
import java.util.Arrays;
import java.util.Scanner;

public class program58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        System.out.print("Enter the number of times the array needs to be rotated left:");
        int k = scanner.nextInt();
        
        for(int i=1;i<=k;i++){
            int temp = arr[0];
            for(int j=1;j<arr.length;j++){
                arr[j-1] =arr[j];
            }
            arr[arr.length - 1] = temp;

        }
        System.out.println(Arrays.toString(arr));

        scanner.close();
    }
    
}
