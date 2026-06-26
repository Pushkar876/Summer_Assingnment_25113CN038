//Write a program to Intersection of arrays.

package Day17;

public class program67 {
    public static void main(String[] args) {
        boolean same = false;
        int arr1[] = {1,2,3,4};
        int arr2[] = {2,3,5,6};
        for(int i=0;i<arr1.length;i++){

            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " " );
                }
            }
          
        }
    }

    
}