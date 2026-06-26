//

package Day17;

public class program68 {
      public static void main(String[] args) {
       
        int arr1[] = {12,34,55,43,21};
        int arr2[] = {25,21,12,35,54};
        for(int i=0;i<arr1.length;i++){

            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " " );
                }
            }
          
        }
    }

}
