//Write a program to Print factors of a number.

package Day5;
import java.util.Scanner;

public class program19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter a number whose Factor needs to be calculated: ");
        n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }

        scanner.close();
    }
    
}
