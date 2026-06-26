//Write a program to Move zeroes to end.

package Day15;

import java.util.Arrays;

public class program60 {
    public static void main(String[] args) {
        int arr[] = {1,0,3,0,4,5};
        int n = arr.length;
        int s = 0, e = n-1;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                ans[s] = arr[i];
                s++;
            }else{
                ans[e] = arr[i];
                e--;
            }
        }
        System.out.println(Arrays.toString(ans));

    }
    
}
