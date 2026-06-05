//Write a program to Check perfect number.

package Day5;
import java.util.Scanner;

public class program17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter a number for which perfect number is to be checked: ");
        n = scanner.nextInt();
        int sum = 0;

        for(int i=1;i<n;i++){
            if(n%i==0){
                sum = sum + i;

            }

        }
        if(sum == n){
            System.out.println("The above number is a perfect number");
        }else{
            System.out.println("The above number is not a perfect number");
        }
        scanner.close();
    }
    
}
