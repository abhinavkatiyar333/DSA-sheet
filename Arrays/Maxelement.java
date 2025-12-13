import java.util.*;
public class Maxelement {
                        // Max element in Array
          public static void main(String[] args) {
                    int arr[] = {2,4,7,4,24,6};
                    int max = Integer.MIN_VALUE;

                    for(int i=0;i<arr.length;i++){
                              if(arr[i]>max){
                                        max = arr[i];
                              }
                    }
                    System.out.println("Max element is = "+max);
          }
          
}
