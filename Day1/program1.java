package Day1;
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.printf("The sum of first %d natural numbers is %d",n,sum);

        scanner.close();
    }
    
}
