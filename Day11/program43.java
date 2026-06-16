//Write a program to Write function to check prime.

package Day11;

import java.util.Scanner;

public class program43 {
    public static void CheckPrime(int a){
        int count = 0;
        for(int i=1;i<=a;i++){
            if(a % i == 0){
                count++;
            }
        }
            if(count == 2){
                System.out.println("The number is a prime number");
            }else{
                System.out.println("The number is not a prime number");
            }
        
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        CheckPrime(x);
        scanner.close();
    }
    
}
