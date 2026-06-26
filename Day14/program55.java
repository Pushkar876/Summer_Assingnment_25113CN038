//Write a program to Second largest element.

package Day14;

public class program55 {
    public static void main(String[] args) {
        int arr[] = {23,13,51,44,38,67};
        int largest = arr[0];
        int secLargest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secLargest){
                secLargest = arr[i];
            }
        }
        System.out.println(secLargest);
        
    }
    
}
