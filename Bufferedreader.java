import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Bufferedreader
 */
public class Bufferedreader {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // String a = st.nextToken();
        String b = st.nextToken();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(b); // 출력
        bw.newLine(); // 줄바꿈
        bw.flush(); // 남아있는 데이터 모두 출력
        bw.close();
    }
}