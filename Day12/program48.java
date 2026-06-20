//Write a program to Write function for perfect number.

package Day12;
import java.util.Scanner;

public class program48 {
    public static void CheckPerfect(int n){
        int sum = 0;
        
        for(int i=1;i<n;i++){
            if(n%i == 0){
               sum = sum + i;
            }
        }
        if(sum == n){
            System.out.println("The number is a Perfect number.");
        }else{
            System.out.println("The number is not a Perfect number.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        CheckPerfect(n);

        scanner.close();
    }
    
}
