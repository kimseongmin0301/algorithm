import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/2941
 * 백준 2941
 * 크로아티아 알파벳
 */
public class CroatianCharacters {
    public static void main(String[] args) throws IOException {
        String [] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b = br.readLine();

        for(int i=0; i<alpha.length; i++) {
            if(b.contains(alpha[i])) {
                b = b.replaceAll(alpha[i], "o");
            }
        }

        System.out.println(b.length());
    }
}
