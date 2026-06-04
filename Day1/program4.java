// Write a program to Count digits in a number. 


package Day1;
import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0; 
        int count = 0;
        System.out.print("Enter a number whose number of digits need to be counted: ");
        n = scanner.nextInt();
        int num = n;
        // approach
        while(n>0){
            n = n/10;
            count++;
        }
        
        System.out.printf("the number of digits in %d is %d",num,count);
        scanner.close();
        

    }

    
}
