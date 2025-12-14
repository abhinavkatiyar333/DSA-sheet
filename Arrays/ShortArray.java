//import java.util.*;

public class ShortArray {         // This is the Dutch National Flag problem (0s, 1s, 2s).
          public static void main(String[] args) {  // short array without using shorting algo
                    int arr[] = { 2, 1, 0, 2, 1, 0 };

                   int low = 0;
                   int mid = 0;
                   int high = arr.length-1;

                   while(high >= mid){
                       if(arr[mid] == 0){
                              int temp = arr[low];
                              arr[low] = arr[mid];
                              arr[mid] = temp;
                              mid++;
                              low++;

                       }else if(arr[mid] == 1){
                              mid++;
                       }else{
                              int temp = arr[mid];
                              arr[mid] = arr[high];
                              arr[high] = temp;
                              
                              high--;
                       }

                   }
                    for (int i = 0; i < arr.length; i++) {
                              System.out.print(arr[i] + " ");
                    }
          }

}
