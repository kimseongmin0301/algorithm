import java.util.ArrayList;
import java.util.List;

public class HateOdd {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> arr = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                arr.add(i);
            }
        }

        System.out.println(arr.stream().mapToInt(x -> x).toArray());
    }
}
