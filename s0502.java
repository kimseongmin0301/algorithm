/**
 * s0502
 * 프로그래머스
 * 없는 숫자 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/86051
 */
import java.util.*;

public class s0502 {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        int answer = 0;

        //자동 정렬하기 위해 set 사용
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++){
            set.add(numbers[i]);
        }

        //false값만 더하기
        for(int i=0; i<10; i++){
            if(!set.contains(i)){
                answer += i;
            }
        }

        System.out.print(answer);

    }
}