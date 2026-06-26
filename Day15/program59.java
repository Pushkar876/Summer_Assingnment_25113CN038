//Write a program to Rotate array right

package Day15;
import java.util.Arrays;
import java.util.Scanner;

public class program59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        System.out.print("Enter the number of times the array needs to be rotated right:");
        int k = scanner.nextInt();
        
        for(int i=1;i<=k;i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j] =arr[j-1];
            }
            arr[0] = temp;

        }
        System.out.println(Arrays.toString(arr));

        scanner.close();
    }
    
}
