// Write a program to Recursive reverse number. 

package Day7;
import java.util.Scanner;

public class program28 {
    static int rev = 0;
    
    public static int ReverseofNum(int n){
        
        int lastdigit = n%10;
        
        if(n == 0){
            return rev;
        }
        
        rev = rev*10 + lastdigit;
        return ReverseofNum(n/10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("enter a number whose reverse needs to be printed: ");
        n = scanner.nextInt();
        int result = ReverseofNum(n);
        System.out.printf("The reverse of number %d is %d",n, result);

        scanner.close(); 
    }
    
}
