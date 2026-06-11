//Write a program to Find x^n without pow().

package Day6;
import java.util.Scanner;

public class program24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int x;
        int result = 1;
        System.out.print("Enter a number:");
        x = scanner.nextInt();
        System.out.print("Enter the power to which a number is to be raised:");
        n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            result = result * x;
        }
        System.out.printf("The result of number %d raised to power %d is %d",x,n,result);

        scanner.close();
    }
    
}
