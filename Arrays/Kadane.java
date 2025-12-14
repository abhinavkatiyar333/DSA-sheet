import java.util.*;
public class Kadane {
            // find the maximum sum of a contiguous subarray
          public static void main(String[] args) {
                    int arr[] = {2,3,-1,5,7,-1};
                  
                    int currentsum = 0;
                    int maxsum = arr[0];

                    for(int i=0;i<arr.length;i++){
                              currentsum += arr[i];
                            
                              maxsum = Math.max(currentsum,maxsum);
                              if(currentsum <= 0){
                               currentsum =0;
                               }


                    }
                    System.out.println("Max contiguous sum = "+maxsum);
          }
          
}
