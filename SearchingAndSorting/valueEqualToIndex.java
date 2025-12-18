import java.util.ArrayList;

public class valueEqualToIndex {
          public static void main(String[] args) {
          ArrayList<Integer>list = new ArrayList<>();
                    
          
          int arr[] = {4,2,5,4,5,7};
          for(int i=0;i<arr.length;i++){
                    if(arr[i]==i+1){
                              list.add(arr[i]);
                    }
          }
          System.out.println(list);
          
}
}
