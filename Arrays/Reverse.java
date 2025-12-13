import java.util.*;

class Reverse{
public static void main(String[] args) {
          int arr[] = {2,5,3,4,7,3};
                                       //bruteforce approach O(n)
          // int newArr[] = new int[arr.length];

          // for(int i=0;i<newArr.length;i++){
          //           newArr[i] = arr[arr.length-1-i];
          // }

          // for(int i=0;i<newArr.length;i++){
          //        System.out.print(newArr[i]+" ");

          // }                          // two pointer approach
          int left = 0;
          int right = arr.length-1;

          while(right>=left){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
          }
          for(int i=0;i<arr.length;i++){
                 System.out.print(arr[i]+" ");
          }

}
}