//Write a program to Convert binary to decimal. 

package Day6;
import java.util.Scanner;

public class program22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int lastdigit;
        int decimal = 0;
        System.out.print("Enter the binary number which is to be converted into decimal: ");
        n = scanner.nextInt();
        int i = 0;
        int num = n;
        while(n>0){
            lastdigit = n%10;
            decimal = decimal + (int)(lastdigit * Math.pow(2, i));
            i++;
            n = n/10;

        }
        System.out.printf("The decimal form of the number %d is %d",num,decimal);


        scanner.close();
    }
    
}
