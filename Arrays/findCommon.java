import java.util.ArrayList;

public class findCommon {  // find common element in three sorted array
          public static void main(String[] args) {
                    int arr1[] = {1,2,3,4};
                    int arr2[] = {2,3,4,9};
                    int arr3[] = {3,4,6,9};
                    int i=0;
                    int j=0;
                    int k=0;
                    ArrayList<Integer>list = new ArrayList<>();

                    while(i<arr1.length && j<arr2.length && k<arr3.length){
                              if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                                        list.add(arr1[i]);
                                        i++;
                                        j++;
                                        k++;

                              }else if(arr1[i]<arr2[j] ){
                                        i++;
                              }else if(arr2[j]<arr3[k] ){
                                        j++;
                              }else{
                                        k++;
                              }
                    }
                    System.out.println(list);
          }
          
}
