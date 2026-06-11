//Write a program to Count set bits in a number.
package Day6;
import java.util.Scanner;

public class program23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int count = 0;
        System.out.print("Enter a number whose set bits is to be counted:");
        n = scanner.nextInt();
        int num =n;
        while(n>0){
            if(n%2 == 1){
                count++;
            }
            n = n/2;        
        }
        System.out.printf("The set bits of number %d is %d",num,count);

        scanner.close();
    }
    
}
