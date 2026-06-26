//Write a program to Find missing number in array.

package Day16;

public class program61 {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        int n = arr.length+1;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int i=0;i<arr.length;i++){
            actualSum = actualSum+arr[i];

        }
        int missingNumber = expectedSum-actualSum;

        System.out.printf("The missing number is %d",missingNumber);


    }
    
}
