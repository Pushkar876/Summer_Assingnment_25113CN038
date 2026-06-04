
//Write a program to Find GCD of two numbers

package Day3;
import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
    int a,b;
    

    System.out.print("Enter two numbers for which GCD needs to be calculated: ");
    a = scanner.nextInt();
    b = scanner.nextInt();
    
    int gcd = 1;
    for(int i=1;i<=a && i<=b ; i++){
        if(a%i == 0 && b%i == 0){
            gcd = i;
        }
    }
    System.out.printf("The greatest common divisor of %d and %d is %d",a,b,gcd);

      
    scanner.close();


    }
}
