//Write a program to Find factorial of a number

package Day1;
import java.util.Scanner;

public class program3 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n;
    int fact = 1;
    System.out.print("Enter a number for which factorial needs to be calculated: ");
    n = scanner.nextInt();
    // approach
    for(int i=1;i<=n;i++){
        fact = fact*i;
    }
    System.out.printf("The factorial of %d is : %d",n,fact);

    scanner.close();
}
    
}
