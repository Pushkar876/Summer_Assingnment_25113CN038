//Write a program to Recursive sum of digits.

package Day7;
import java.util.Scanner;

public class program27 {
    public static int sumofDigits(int n){
        int lastdigit = n%10;
        if(n==0){
            return 0;
        }
        return lastdigit + sumofDigits(n/10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter a number whose sum of digits need to be calculated:");
        n = scanner.nextInt();
        int ans = sumofDigits(n);
        System.out.printf("The sum of digit of number %d is %d",n,ans);

        scanner.close();
    }
    
}
