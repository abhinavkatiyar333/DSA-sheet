
public class rightRotatebyOne {
          public static void main(String[] args) {
                    int arr[] = {1,2,3,4,5};
                    int arr1[] = {2,3,4,5,6};

                    // Right rotate by one place
                    

                    int last  = arr[arr.length-1];

                    for(int i=arr.length-1;i>0;i--){
                        arr[i] = arr[i-1];

                    }
                    arr[0] = last;
                    

                    for(int i=0;i<arr.length;i++){
                              System.out.print(arr[i]+" ");
                    }
                    System.out.println();

                    // left rotate by one place
                    int first = arr1[0];

                   for (int i = 0; i < arr1.length - 1; i++) {
                     arr1[i] = arr1[i+1];
                  }
                     arr1[arr1.length - 1] = first;

                   
                   for(int i=0;i<arr1.length;i++){
                              System.out.print(arr1[i]+" ");
                    }
          }
}
