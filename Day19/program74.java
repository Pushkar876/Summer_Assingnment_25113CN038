//Write a program to Subtract matrices.

package Day19;

import java.util.Scanner;

public class program74 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 2;
        int col = 2;
        int arr1[][] = new int[row][col];
        int arr2[][] = new int[row][col];
        int difference[][]  = new int[row][col];

        System.out.println("Enter elements of First Matrix: ");

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the element of second Matrix: ");
       
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                difference[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        System.out.println();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(difference[i][j] + " ");
            }
            System.out.println();
        }
    
        scanner.close();
        
    }


    
}
