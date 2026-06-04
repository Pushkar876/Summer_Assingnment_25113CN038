//Write a program to Print prime numbers in a range


package Day3;
import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter a range(number) upto which prime Number needs to be printed: ");
        n = scanner.nextInt();
        int count =0;

        for(int j=1;j<=n;j++){
            count =0;
        for(int i=1;i<=j;i++){
            if(j%i==0){
                count++;
            }
            
            }
             if(count == 2){
                System.out.println(j);
        }
       
      }
     
    }
    
}
