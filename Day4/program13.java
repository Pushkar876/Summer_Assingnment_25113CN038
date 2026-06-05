//Write a program to Generate Fibonacci series.


package Day4;
import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 1,c;
        int n;
        System.out.print("Enter the number of term upto which Fibonacci series needs to be generated: ");
        n = scanner.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print(" " + a);
            c = a+b;
            a = b;
            b = c;

        }

        scanner.close();
    }
    
}
