//Write a program to Find pair with given sum. 

package Day16;

public class program63 {
    public static void main(String[] args) {
        int arr[] = {2,3,6,1,9,8};
        int target = 14;
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    System.out.printf("Pairs found: %d and %d",arr[i],arr[j]);
                    found = true;
                }
            }
            

        }if(!found){
            System.out.println("No pairs are found!!");
        }

    }
    
}
