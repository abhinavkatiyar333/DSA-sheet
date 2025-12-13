import java.util.*;
public class min {
          public static void main(String[] args) {
                    int arr[] = {2,5,37,5,43};
                    int min = Integer.MAX_VALUE;

                    for(int i=0;i<arr.length;i++){
                              if(arr[i]<min){
                                        min = arr[i];
                              }
                    }
                    System.out.println(min);
          }
          
}
