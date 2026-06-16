//Write a program to Write function to find maximum.

package Day11;
import java.util.Scanner;

public class program42 {
    public static void Max(int a,int b){
        if(a>b){
            System.out.println("FirstNumber is maximum");
        }else{
            System.out.println("SecondNumber is maximum");
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        Max(a, b);
        scanner.close();
    }
    
}
