//Write a program to Check whether a number is plaindrome.


package Day2;
import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int lastdigit;
        int rev = 0 ;

        System.out.print("Enter a number which needs to be checked: ");
        n = scanner.nextInt();
        int num = n;

        while(n>0){
            lastdigit = n%10;
            rev = rev*10 + lastdigit;
            n = n/10;
        }
        String result = (num == rev)?("Palindrome Number"):("Not a Palindrome Number");
        System.out.printf("The above number is %s ",result); 

        scanner.close();
    }
    
}
