//Write a program to Write function for Armstrong.

package Day12;
import java.util.Scanner;

public class program46 {
    public static void CheckArmstrong(int n){
        int num = n;
        int sum = 0;

        while(n>0){
            int lastdigit = n%10;
            sum = sum + lastdigit*lastdigit*lastdigit;
            n = n/10; 

        }
        if(num == sum){
            System.out.println("The number is an armstrong number.");
            
        }
        else{
            System.out.println("The number is not an armstrong number.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ;
        System.out.print("Enter a three digit number: ");
        n = scanner.nextInt();
        CheckArmstrong(n);

        scanner.close();
    }
    
}
