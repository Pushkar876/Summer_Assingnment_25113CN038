//Write a program to Write function to find sum of two number.


package Day11;
import java.util.Scanner;

public class program41 {
    public static int SumofTwo(int a,int b){
        int sum = a + b;
        return  sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int x = scanner.nextInt();
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();
        
        int  result = SumofTwo(x, y);
        System.out.println(result);
        scanner.close();
    }
    
}
