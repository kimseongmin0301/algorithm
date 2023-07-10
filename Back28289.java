import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/28289
 * 백준 28289
 * 과 조사하기
 */
public class Back28289 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //입력 개수
        int[] result = new int[4];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int grade = Integer.parseInt(st.nextToken());
            if(grade == 1) {
                result[3]++;
            } else {
                int classNum = Integer.parseInt(st.nextToken());
                if(classNum == 1 || classNum == 2) {
                    result[0]++;
                } else if (classNum == 3) {
                    result[1]++;
                } else if (classNum == 4) {
                    result[2]++;
                }
            }
        }
        System.out.println(result[0] + "\n" + result[1] + "\n" + result[2] + "\n" + result[3]);
    }
}
