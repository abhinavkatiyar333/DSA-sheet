import java.util.*;
public class BestTimebuySell {
          public static void main(String[] args) {
                    int arr[] = {7,1,5,3,6,4};
                   int minbuy = arr[0];
                   int maxprofit = 0;

                   for(int i=1;i<arr.length;i++){
                          if(arr[i]<minbuy){
                              minbuy = arr[i];
                          }else{
                              int profit = arr[i]-minbuy;
                              maxprofit = Math.max(maxprofit,profit);
                          }
                   }

                    

                    
                   System.out.println("Max profit = "+maxprofit);
          }
          
}
