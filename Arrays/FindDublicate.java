import java.util.*;
public class FindDublicate {
                     // find  dublicate  in array
          public static void main(String[] args) {
                    int arr[] = {1,3,4,2,2};
                    
                    Arrays.sort(arr);
                   
                    

                   for(int i=1;i<arr.length;i++){
                        if(arr[i]==arr[i-1]){
                              System.out.println(arr[i]);
                         break;
                    }

                   }




                    
          }
          
}
