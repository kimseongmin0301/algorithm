/**
 * 백준 1157
 * 단어공부
 * https://www.acmicpc.net/problem/1157
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Back1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b = br.readLine().toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        int cnt = 0;
        char maxChar = '?';

        for(int i=0; i<b.length(); i++) {
            char ch = b.charAt(i);
            int count = map.getOrDefault(ch, 0) + 1;
            map.put(ch, count);

            if (count > cnt) {
                cnt = count;
                maxChar = ch;
            } else if (count == cnt) {
                maxChar = '?';
            }
        }

        System.out.println(maxChar);
    }
}
