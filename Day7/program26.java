//Write a program to Recursive Fibonacci

package Day7;
import java.util.Scanner;


public class program26 {
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2); 

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int fibonacci = fibonacci(n);
        System.out.printf("the %dth fibonacci term is %d ",n,fibonacci);

        scanner.close();

        
    }
    
}
