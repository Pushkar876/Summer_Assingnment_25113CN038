//Write a program to Check strong number.

package Day5;
import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter a number for which strong number is to be checked: ");
        n = scanner.nextInt();
        int lastdigit;
        int sum = 0;
        int num = n;
        while(n>0){
            int fact = 1;
            lastdigit = n%10;
            for(int i=1;i<=lastdigit;i++){
                fact = fact*i;
                
            }
            sum = sum + fact;
            n = n/10;
            

        }
        if(sum == num){
            System.out.println("The above number is a Strong number");

        }else{
            System.out.println("The above number is not a Strong number");
        }
            
        scanner.close();
    }
    
}
