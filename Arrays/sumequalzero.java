public class sumequalzero {
          public static void main(String[] args) {
                    int arr[] = {2,1,-1,4,5,6};
                    
                    for(int i=0;i<arr.length;i++){
                              int sum =0;
                              for(int j=i;j<arr.length;j++){
                                        sum+=arr[j];
                                        if(sum == 0){
                                                  System.out.println("true");
                                                  return;
                                        }
                              }
                    }
                    System.out.println("not exist");
                    
                      
          }
}
          

