import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Back1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
            b.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(a);
    }
}
