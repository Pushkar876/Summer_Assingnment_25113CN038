//Write a program to Recursive factorial.

package Day7;
import java.util.Scanner;

public class program25 {
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.print("Enter a number:");
        n = scanner.nextInt();
        int fact = factorial(n);
        System.out.printf("The factorial of number %d is %d ",n,fact);


        scanner.close();
    }
    
}
