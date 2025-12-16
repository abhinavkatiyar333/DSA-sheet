import java.util.*;
public class findFactorial {
                        // find factorial of large number

          public static int fact(int n){
                    if(n==0){
                          return 1;    
                    }else{
                         return n*fact(n-1) ;    
                    }
          }
          public static void main(String[] args) {
                    int n = 10;
                    System.out.println(fact(n));
                    int ans = fact(n);

                    ArrayList<Integer>list = new ArrayList<>();
                    while(ans>0){
                       list.add(ans%10);       
                       ans = ans/10;
                    }
                    
                   System.out.println( list.reversed());

     }
          
}
