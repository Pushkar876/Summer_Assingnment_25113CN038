//Write a program to Find product of digits.

package Day2;
import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int lastdigit;
        int product = 1;

        System.out.print("Enter a number whose product of digits needs to be calculated: ");
        n = scanner.nextInt();
        int num = n;
        while(n>0){
        lastdigit = n%10;
        product = product*lastdigit;
        n = n/10;
        }
        System.out.printf("The product of digit of %d is %d",num,product);



        scanner.close();
    }

    
}
