//Write a program to Remove duplicates from array.

package Day16;

public class program64 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,6,6,7};
        System.out.println("Array after removing Duplicates: ");
        for(int i=0;i<arr.length;i++){
            boolean duplicates = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    duplicates = true;
                    break;
                
                }
            }
            if(!duplicates){
                System.out.print(arr[i] + " ");
            }
        }
    }
    
}
