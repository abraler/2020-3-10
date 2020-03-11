
    import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        int n= countWays(50);
        System.out.println(n);
    }
        public static int countWays(int n) {
            // write code here
            if(n<1){
                return 0;
            }
            if(n==1){
                return 1;
            }
            if(n==2){
                return 2;
            }
            if(n==3){
                return 4;
            }
            return countWays(n-1)+countWays(n-2)+countWays(n-3);
        }
}
