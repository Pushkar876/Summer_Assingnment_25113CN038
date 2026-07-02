//Write a program to Transpose matrix. 

package Day19;

import java.util.Scanner;

public class program75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 2;
        int col = 3;
        int arr1[][] = new int[row][col];
        int arr2[][] = new int[col][row];

        System.out.println("Enter the elements of matrix: ");

        for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j < col; j++){
                arr1[i][j] = scanner.nextInt();

                }
            }
            for(int i = 0 ; i < row; i++){
                for(int j = 0 ; j < col; j++){
                    arr2[j][i] = arr1[i][j];

                }
            }
            System.out.println("Transpose matrix: ");

            for(int i = 0 ; i < col; i++){
               for(int j = 0 ; j < row; j++){
                  System.out.print(arr2[i][j] + " ");

                }
                System.out.println();
            }
            scanner.close();

            
        }


        
        

    }

    

