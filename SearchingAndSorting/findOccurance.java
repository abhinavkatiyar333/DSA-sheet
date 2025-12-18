public class findOccurance {
          public static void main(String[] args) {
                    // Find first and last occurrence of target element
                    int arr[] = {1,2,3,3,3,3,4,5};
                    int left =0;
                    int right = arr.length-1;
                    int target = 3;
                    int ans = -1;


                    while(right>=left){
                              int mid = (left+ (right-left)/2);
                              if(arr[mid] == target){
                                // for first occurrence
                                     ans = mid;
                                     right = mid-1;

                               }
                               else if(arr[mid]<target){
                                        left = mid+1;
                                   }else{
                                        right = mid-1;
                              }
                    }

                    left =0;
                    right = arr.length-1;
                    int last = -1;

                    while(right>=left){
                              int mid = (left+ (right-left)/2);
                              if(arr[mid] == target){
                                // for Last occurrence
                                     last = mid;
                                     left = mid+1;

                               }
                               else if(arr[mid]<target){
                                        left = mid+1;
                                   }else{
                                        right = mid-1;
                              }
                    }
                    System.out.println("First occurrance is = "+ans);
                    System.out.println("Find last occurrence is = "+last);

                    
          }
          
}
