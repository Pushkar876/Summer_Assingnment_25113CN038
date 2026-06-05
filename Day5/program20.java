//Write a program to Find largest prime factor.

package Day5;
import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter a number whose largest Prime Factor needs to be printed:");
        n = scanner.nextInt();
        int LargestPrimeFactor = 1;
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count =0;

            }
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    
                    count++;
                }


            }
            if(count == 2){
                LargestPrimeFactor = i;
                
            }
            
          
        }
         System.out.printf("The largest Prime Factor of %d is %d",n,LargestPrimeFactor);

        scanner.close();
    }
    
}
