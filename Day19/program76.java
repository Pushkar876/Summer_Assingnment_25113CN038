//Write a program to Find diagonal sum. 

package Day19;


import java.util.Scanner;

public class program76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        int sum = 0;
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("element at arr[%d][%d]: ",i,j);
                arr[i][j] = scanner.nextInt();
            }
        
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        
        }

        

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i == j || i + j == n-1){
                    sum = sum + arr[i][j];

                }

            }
        }
        System.out.printf("The sum of diagonal elements is %d",sum);


        scanner.close();
        

    }
    
}
