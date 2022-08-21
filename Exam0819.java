/**
 * K번째 큰 수
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Exam0819 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> hs = new ArrayList<>();
        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            hs.add(Integer.parseInt(st.nextToken()));
        }

        for(int i=0; i<N-2; i++){
            for(int j = i+1; j<N-1; j++){
                for(int k = j+1; k<N; k++){
                    ts.add(hs.get(i)+hs.get(j)+hs.get(k));
//                    System.out.println("i : " + hs.get(i) + " j : " + hs.get(j) + " k : " + hs.get(k));
                }
            }
        }

        int answer = -1;

        int cnt =0;
        for(int x: ts){
            cnt++;
            if(cnt == K){
                answer= x;
                break;
            }
        }
        System.out.println(answer);

    }
}
