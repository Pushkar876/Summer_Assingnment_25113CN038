//Write a program to Union of arrays.

package Day17;

public class program66 {
    public static void main(String[] args) {
        int arr1[] = {4,3,5,2};
        int arr2[] = {6,1,7,2};
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        for(int i=0;i<arr2.length;i++){

            boolean same = false;
            if(arr2[i] == arr1[i]){
                break;
            }

        
        if(!same){
            System.out.print(arr2[i] + " ");
        }
    }
    }
    
}
