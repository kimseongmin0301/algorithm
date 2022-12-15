/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120854
 *
 * 배열 원소의 길이
 */

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(Arrays.toString(test.ArrayElementLen()));
    }

    public int[] ArrayElementLen(){
        String [] strlist = {"We", "are", "the", "world!"};

        int [] answer = new int[strlist.length];
        int idx = 0;

        for(String s : strlist){
            answer[idx] = s.length();
            idx++;
        }

        return answer;
    }
}
