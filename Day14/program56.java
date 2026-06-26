//Write a program to Find duplicates in array.

package Day14;

public class program56 {
    public static void main(String[] args) {
        int arr[] = {12,45,33,44,45,33};
        System.out.println("duplicates elements are: ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }

        }
    }
    
}
