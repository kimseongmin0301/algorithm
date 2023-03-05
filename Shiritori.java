/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12981?language=java
 * 프로그래머스 영어 끝말잇기
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Shiritori {
    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        Shiritori s = new Shiritori();
        System.out.println(Arrays.toString(s.solution(n, words)));
    }

    public int[] solution(int n, String[] words){
        int[] answer = {0,0};
        Set<String> set = new HashSet<>(Arrays.asList(words[0]));
        char lastChar = words[0].charAt(words[0].length() - 1);

        for(int i=1; i<words.length; i++){
            char firstChar = words[i].charAt(0);

            if(set.contains(words[i]) || firstChar != lastChar){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            } else{
                set.add(words[i]);
                lastChar = words[i].charAt(words[i].length() - 1);
            }
        }

        return answer;
    }

}
