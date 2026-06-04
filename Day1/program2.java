// Write a program to Print multiplication table of a given number


package Day1;
import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int table = 0;
        System.out.print("Enter a number for which multiplication table needs to be printed: ");
        n = scanner.nextInt();

        for(int i=1;i<=10;i++){
            table = n*i;
            System.out.printf("\n%d * %d = %d ",n,i,table);


        }
        scanner.close();

    }
    
}
