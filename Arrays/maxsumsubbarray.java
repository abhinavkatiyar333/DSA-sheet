public class maxsumsubbarray {
          public static void main(String[] args) {
                    // Sliding window problem
                    
          
          // Maximum sum of subArray of size k
          int arr[] = {2, 1, 5, 1, 3, 2};
          int k =3;

          int maxsum = 0;
          int j =0;
           int sum = 0;
          for(int i=0;i<arr.length;i++){
                   
                    sum+=arr[i];
                    if(i>k-1){
                          sum =  sum-arr[j];
                          j++;
                    }
                    maxsum = Math.max(sum,maxsum);

          }
          System.out.println(maxsum);
          
}   
}
