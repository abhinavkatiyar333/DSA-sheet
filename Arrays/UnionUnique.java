import java.util.HashSet;

public class UnionUnique {
                         // Union of two array only unique value
          public static void main(String[] args) {

                    int arr1[] = {1,2,2,3,4,5};
                    int arr2[] = {3,4,5,3,4,5};

           HashSet<Integer>set = new HashSet<>();

           for(int i=0;i<arr1.length;i++){
                    set.add(arr1[i]);
           }

           for(int i=0;i<arr1.length;i++){
                    set.add(arr2[i]);
           }

           System.out.println(set);         
          }
          }
