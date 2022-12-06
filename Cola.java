/**
 * 프로그래머스
 * 콜라문제
 * https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */
public class Cola {
    public static void main(String[] args) {
        int a = 2, b = 1, n = 20;
        int answer = 0;

        while(n >= a){
            answer += (n / a) * b;
            int refill = n % a;

            n = (n / a) * b + refill;
        }

        System.out.println(answer);
    }
}
