// Write a program to Find LCM of two numbers. 

package Day3;
import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        int LCM;
        System.out.print("Enter two numbers for whose LCM needs to be calculated: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        int gcd = 1;

        for(int i =1 ;i<=a && i<=b ;i++){
            if(a%i == 0 && b% i == 0 ){
                gcd = i;
            }
        }
        LCM = (a*b) / gcd; 
        System.out.printf("The LCM of Two numbers %d and %d is %d",a,b,LCM);

        scanner.close();
    }
    
}
