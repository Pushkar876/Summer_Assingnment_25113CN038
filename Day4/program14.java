//Write a program to Find nth Fibonacci term

package Day4;
import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b=1,c =0;
        int n;
        System.out.print("Enter the term: ");
        n = scanner.nextInt();
        if(n==1){
            System.out.printf("%dst Fibonacci term is %d",n,a);
        }else if(n == 2){
            System.out.printf("%dnd Fibonacci term is %d",n,b);

        }else{
            for(int i=3;i<=n;i++){
                c = a+b;
                a = b;
                b = c;
            }
            if(n==3){
            System.out.printf("%drd Fibonacci term is %d",n,c);

        }else{
             System.out.printf("%dth Fibonacci term is %d",n,c);

        }
       
        }
        



        scanner.close();
    }
    
}
