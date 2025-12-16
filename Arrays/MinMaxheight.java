import java.util.Arrays;

public class MinMaxheight {
          // Minimize and Maximize difference between height
          public static void main(String[] args) {
                    int arr[] = {3,9,12,16,20};
                    int k = 3;
                    Arrays.sort(arr);
                  
                    int ans =arr[arr.length-1] - arr[0];
                    int smallest = arr[0]+k;
                    int largest = arr[arr.length-1]-k;


                    for(int i=0;i<arr.length-1;i++){
                              int min = Math.min(smallest,arr[i+1]-k);
                              int max = Math.max(largest,arr[i]+k);

                              if(min<0){
                                        continue;
                              }
                              ans = Math.min(ans,max-min);


                    }
                    System.out.println(ans);



          }
          
}
