public class maxProductsubarray {
          public static void main(String[] args) {
                    int arr[] = {-2,6,3,0,5};
                  //  int product =1;
                    int maxproduct = arr[0];

                    for(int i=0;i<arr.length;i++){
                          int  product = 1;
                              for(int j=i;j<arr.length;j++){
                                 product *= arr[j];
                                 maxproduct = Math.max(product,maxproduct);
                              }

                              
           }
           System.out.println(maxproduct);
          }
          
}
