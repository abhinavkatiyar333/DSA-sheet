public class SearchIn {
          public static void main(String[] args) {
                    // Search in Rotated shorted Array
                     int nums[] = {4,5,6,7,0,1,2};
                     int start = 0;
                     int end = nums.length-1;
                     int target = 4;

                      while(start<=end){
                       int mid = start + (end-start)/2;

                       if(nums[mid]== target){
                        System.out.println(mid);
                     }
                       // check left half is sorted 
                     if(nums[start]<= nums[mid]){
                if(nums[start]<= target &&  target < nums[mid] ){
                        end = mid-1;
                         }else{
                     start = mid+1;
                     }
                  }
                        // check in right half
                    else{
                  if(nums[mid]<target && target <= nums[end]){
                      start = mid+1;
                       }else{
                        end = mid-1;
                    }
               }
               }
          }
          
}
