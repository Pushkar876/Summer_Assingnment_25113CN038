//Write a program to Find maximum frequency element.

package Day16;

public class program62 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,3,4,5,6};
        int Maxfreq = 0;
        int MaxfreqElement = arr[0];
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
             if(count>Maxfreq){
            Maxfreq = count;
            MaxfreqElement = arr[i];
        }
       

        }
        System.out.printf("The maximum frequency element is %d with frequncy %d",MaxfreqElement,Maxfreq);

    }
    
}
