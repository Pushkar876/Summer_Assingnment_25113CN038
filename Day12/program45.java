//Write a program to Write function for palindrome.
package Day12;
import java.util.Scanner;

public class program45 {
    public static void CheckPalindrome(int n){
        int num = n;
        int rev = 0;
        while(n>0){
        int lastdigit = n%10;
        rev = rev*10 + lastdigit;
        n = n/10;
        }
        if(rev == num){
            System.out.println("The number is a palindrome number.");
        }
        else{
            System.out.println("The number is not a palindrome number.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter a number:");
        n = scanner.nextInt();
        CheckPalindrome(n);

        scanner.close();

    }
    
}
