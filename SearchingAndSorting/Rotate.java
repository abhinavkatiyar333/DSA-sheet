public class Rotate {
          // Left rotate by d place

        static void Answer(int arr[],int left,int right){
           
           while(right >= left){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
            
        }
      }
          public static void main(String[] args) {
                    int arr[] = {1,2,3,4,5};
                    int d =2;
                    int n = arr.length;
                     d = d%n;
                    Answer(arr, 0, d-1);
                    Answer(arr, d, n-1);
                    Answer(arr, 0, n-1);
                    for(int i=0;i<arr.length;i++){
                              System.out.print(arr[i]+" ");
                    }


          
          }
          
}
