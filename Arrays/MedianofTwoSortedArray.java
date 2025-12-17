public class MedianofTwoSortedArray {
          // Merge two sorted array with equal time and find Median
          public static void main(String[] args) {
                    int arr1[]= {1,3,5,7};
                    int arr2[]= {0,2,4,6};
                    int newArr[] = new int[arr1.length+arr2.length];
                    int i=0;
                    int j=0;
                    int k=0;

                    while(i<arr1.length && j<arr2.length){
                              if(arr1[i]<arr2[j]){
                                 newArr[k]=arr1[i];
                                        i++;
                                        k++;
                              }else {
                                        newArr[k] = arr2[j];
                                        j++;
                                        k++;
                              }
                    }
                    while(i<arr1.length){
                              newArr[k] = arr1[i];
                              i++;
                              k++;
                    }
                    while (j<arr2.length) {
                              newArr[k] = arr2[j];
                              j++;
                              k++;
                              
                    }
                   
                    // medium
                    int n = newArr.length;
                       double median;

                   if (n % 2 == 0) {
                   median = (newArr[n/2 - 1] + newArr[n/2]) / 2.0;
                    } else {
                   median = newArr[n/2];
                     }

                  System.out.println(median);

          }
          
}
