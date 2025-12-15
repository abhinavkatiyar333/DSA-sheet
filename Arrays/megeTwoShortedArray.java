import java.util.*;
public class megeTwoShortedArray {
          public static void main(String[] args) {
                    int arr1[] = {0,2,4,6};
                    int arr2[] = {1,3,5,7};
                    int newarr[] = new int[arr1.length + arr2.length];
                    
                    int i=0;
                    int j=0;
                    int k =0;

                      
               while(j<arr1.length && k<arr2.length){
                    
                              if(arr1[j]<arr2[k]){
                                        newarr[i] = arr1[j];
                                        j++;
                              }else{
                                        newarr[i]  = arr2[k];
                                        k++;
                              }

                            i++;
                  }
                   
                    while( j<arr1.length ){
                              newarr[i] = arr1[j];
                              i++;
                              j++;
                    }
                    while( k<arr2.length){
                              newarr[i] = arr2[k];
                              i++;
                              k++;
                    }

                    for(int l=0;l<newarr.length;l++){
                              System.out.print(newarr[l]+" ");
                    }
                    

                    

          }
          
}
