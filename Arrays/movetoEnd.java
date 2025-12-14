import java.util.*;
public class movetoEnd {
          // move negative value to end
          public static void main(String[] args) {
                    int arr[] ={-1,2,-3,4,-5,6,-7,8};

                    int left = 0;
                    int right = arr.length-1;

                    while(right>=left){
                              if(arr[left]>0){
                                        left++;
                              }else if(arr[right]<0){
                                        right--;
                              }
                              else{
                              int temp = arr[left];
                              arr[left] = arr[right];
                              arr[right] = temp;
                              }
                             
                    }
                    for(int i=0;i<arr.length;i++){
                              System.out.print(arr[i]+" ");
                    }
          }
          
}
