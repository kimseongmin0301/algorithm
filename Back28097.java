import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 28097번
 * 모범생 포닉스
 * https://www.acmicpc.net/problem/28097
 */
public class Back28097 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //입력 개수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int time = 0;
        int rest = 8;
        int day = 0;
        String result = "";

        if(n != 1) {
            time += rest * (n - 1);
        }

        for(int i=0; i < n; i++){
            time += Integer.parseInt(st.nextToken());
        }

        day = time / 24;
        time = time % 24;
        result = day + " " + time;
        System.out.println(result);
    }
}
