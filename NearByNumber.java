/**
 * 프로그래머스
 * 가까운 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120890
 */

import java.util.Arrays;

class NearByNumber{
    static int [] array = {2};
    static int n = 20;
    public static void main(String[] args) {
        int answer = 0;
        Arrays.sort(array);
        for(int i : array){
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }
        answer = array[0];

        System.out.println(answer);
    }
}