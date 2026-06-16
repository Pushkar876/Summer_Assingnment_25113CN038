//Write a program to Print character pyramid. 

package Day10;

public class program40 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            char ch = 'A';
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
                
            }
            ch-=2;
            
            for(int j=1;j<i;j++){
                System.out.print(ch);
                ch--;
                
            }
            System.out.println();
        }
    }
}
