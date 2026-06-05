// Write a program to Check Armstrong number

package Day4;
import java.util.Scanner;

public class program15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum =0;
        int lastdigit;
        System.out.print("Enter a number to be checked for Armstrong number: ");
        n = scanner.nextInt();
        int num =n;
        while(n>0){
            lastdigit = n%10;
            sum = sum + (lastdigit*lastdigit*lastdigit);
            n = n/10;
        }
        if(num==sum){
            System.out.println("The above number is an armstrong number");

        }else{
            System.out.println("The above number is not an armstrong number");
        }


        scanner.close();


    }
    
}
