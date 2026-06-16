//Write a program to Write function to find factorial.

package Day11;
import java.util.Scanner;

public class program44 {
    public static int factorial(int a){
    int fact = 1;
    for(int i=1;i<=a;i++){
        fact = fact*i;
    }
    return fact;
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int x = scanner.nextInt();
    int result = factorial(x);
    System.out.printf("The factorial of %d is %d",x,result);

    scanner.close();
}
    
}
