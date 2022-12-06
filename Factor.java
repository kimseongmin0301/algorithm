/**
 * 프로그래머스
 * 소인수 분해
 * https://school.programmers.co.kr/learn/courses/30/lessons/120852?language=java
 */

import java.util.*;

public class Factor {
    public static void main(String[] args) {
        int n = 12;
        int[] answer = {};
        int i = 2;
        List<Integer> arr = new ArrayList<>();
        while(i < n){
            if(n % i == 0){
                arr.add(i);
                n /= i;
            }
            i++;
        }

        answer = arr.stream().distinct().mapToInt(Integer::intValue).toArray();

//        for(int j=0; j<answer.length; j++){
//            System.out.println(answer[j]);
//        }
    }
}
