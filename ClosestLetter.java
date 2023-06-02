import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ClosestLetter {
    public static void main(String[] args) {
        String s = "banana";

        System.out.println(Arrays.toString(solution(s)));
    }

    static int[] solution(String s) {
        int [] answer = new int[s.length()];
        Arrays.fill(answer, -1);

        Map<Character, Integer> hm = new HashMap<>();

        for(int i=0; i< s.length(); i++) {
            char c = s.charAt(i);

            if(hm.containsKey(c)) {
                int idx = hm.get(c);
                answer[i] = i - idx;
            }

            hm.put(c, i);
        }

        return answer;
    }
}