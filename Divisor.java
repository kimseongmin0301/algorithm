import java.util.*;
public class Divisor {
    public static void main(String[] args) {
        int n = 24;
        List<Integer> set = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(n%i==0){
                set.add(i);
            }
        }
    }
}
