import java.util.*;
public class Secondlargest {
          public static void main(String[] args) {
                    int arr[] = {2,3,5,7,4,6};
                    int largest = Integer.MIN_VALUE;
                    int secondLargest = Integer.MIN_VALUE;
                                     // Brute force Approach

          //           for(int i=0;i<arr.length;i++){
          //                     if(arr[i]>largest){
          //                               largest = arr[i];
          //                     }
          //           }
          //           for(int i=0;i<arr.length;i++){
          //                     if(arr[i]>secondLargest && arr[i]<largest){
          //                               secondLargest = arr[i];
          //                     }
          //           }

          //           System.out.println("Second largest element is = "+secondLargest);


                                       // Optimal Approach  

                  for(int i=0;i<arr.length;i++){
                      if(arr[i]>largest){
                              secondLargest = largest;
                              largest = arr[i];
                      }else if(arr[i] > secondLargest && arr[i] != largest){
                              secondLargest = arr[i];
                      }
                  } 
                  System.out.println("Second largest element is = "+secondLargest); 

           }
          
}
