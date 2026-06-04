// Write a program to Reverse a number


package Day2;
import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int rev =0;
        int lastdigit;
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        int num = n;

        while(n>0){
            lastdigit = n%10;
            rev = rev*10 + lastdigit;
            n = n/10;
            
        }

        System.out.printf("The reverse of %d is %d",num,rev);

        scanner.close();

        
    }
}
