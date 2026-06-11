//Write a program to Convert decimal to binary.
package Day6;
import java.util.Scanner;

public class program21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String binary = "";
        int remainder;
        System.out.print("Enter the decimal number which is to be converted into binary: ");
        n = scanner.nextInt();
        int num = n;
        while(n>0){
            remainder = n%2;
            binary = remainder+binary;
            n = n/2;
        }
        System.out.printf("The binary form of the number %d is %s",num,binary);


        scanner.close();
    }


}