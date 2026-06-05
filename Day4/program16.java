//Write a program to Print Armstrong numbers in a range


package Day4;
import java.util.Scanner;

public class program16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n;
        int sum =0;
        int lastdigit;
        System.out.print("Enter a range(number) upto which armstrong number needs to be printed: ");
        n = scanner.nextInt();
        
        
        for(int i=1;i<=n;i++){
            int digits = 0;
            sum = 0;
            int num = i;

            while(num>0){
                digits++;
                num = num/10;
            }
            num = i;
            
        while(num>0){
            lastdigit = num%10;
            sum = sum + (int)Math.pow(lastdigit,digits);
            num = num/10;
            
        }
        if(i==sum){
            System.out.println(i);

        }
          
        
    }
        
        scanner.close();
    }
    
}
