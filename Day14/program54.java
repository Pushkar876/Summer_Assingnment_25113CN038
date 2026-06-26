//Write a program to Frequency of an element.

package Day14;
import java.util.Scanner;

public class program54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
;        int arr[] = {1,2,2,3,4,5,6};
        int target;
        int count = 0;
        System.out.print("Enter the element whose frequency needs to be find out: ");
        target = scanner.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                count++;

            }
        
        }
        System.out.printf("The frequncy of element %d is %d ",target,count);
    }
    
}
