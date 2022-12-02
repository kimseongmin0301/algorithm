/**
 * 프로그래머스
 * 특이한 정렬
 * https://school.programmers.co.kr/learn/courses/30/lessons/120880?language=java
 */

import java.util.*;

public class StrangeSort {
    static int [] numlist = {1, 2, 3, 4, 5, 6};
    static int n = 4;

    public int[] sort(int[] numlist, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int [] answer = new int[numlist.length];

        Arrays.sort(numlist);

        for(int i=0; i<numlist.length; i++){
            map.put(i, Math.abs(n - numlist[i]));
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());

        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        Collections.reverse(keySet);

        for(int i=0; i<answer.length; i++){
            answer[i] = numlist[keySet.get(i)];
        }

        return answer;
    }
}