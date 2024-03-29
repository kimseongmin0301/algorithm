import java.util.*;

public class Back1026 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for(int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        for(int i=0; i<n; i++){
            b.add(sc.nextInt());
        }

        Collections.sort(b);
        Collections.sort(a,Comparator.reverseOrder());

        int sum = 0;

        for(int i=0; i<n; i++){
            sum += a.get(i) * b.get(i);
        }

        System.out.println(sum);
    }
}

