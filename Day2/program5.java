//Write a program to Find sum of digits of a number


package Day2;
import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int lastdigit;
        int sum = 0;
        System.out.print("Enter a number whose sum of digit needs to be calculated:");
        n = scanner.nextInt();
        int num = n;
        while(n>0){
            lastdigit = n%10;
            sum = sum + lastdigit;
            n = n/10;

        }
        System.out.printf("The sum of digits of %d is %d",num,sum);
        scanner.close();
        
        
    }
    
}
