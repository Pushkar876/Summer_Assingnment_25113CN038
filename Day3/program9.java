// Write a program to Check whether a number is prime.

package Day3;
import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int count =0;
        System.out.print("Enter a number which needs to be checked for prime: ");
        n = scanner.nextInt();
        

        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }

        }
        String result = (count==2)?("Prime Number"):("Not a Prime Number");
        System.out.printf("The above number is %s",result);
        scanner.close();
    }
}
