//Write a program to Write function for Fibonacci.

package Day12;
import java.util.Scanner;


public class program47 {
    public static int fibonacci(int n){
        int a = 0, b = 1,c = 0;
        if(n == 1){
            return a;
        }else if(n == 2){
            return b;
        }
        else{
            for(int i=3;i<=n;i++){
                 c = a + b;
                 a = b;
                 b = c;
            }
            return c;
        }
        

    }
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("enter number of terms: ");
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));

        scanner.close();
        
    }
    
}
