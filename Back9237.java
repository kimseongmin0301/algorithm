import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/9237
 * 백준 이장님 초대
 */
public class Back9237 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = Integer.parseInt(st.nextToken());
        int[] arr = new int[cnt];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int maxDay = 0;

        for(int i=0; i<cnt; i++) {
            maxDay = Math.max(maxDay, arr[i] + cnt - i);
        }

        maxDay++;

        System.out.println(maxDay);
        br.close();
    }
}
