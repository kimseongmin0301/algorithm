/**
 * 프로그래머스 옹알이(1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120956
 */
public class Babbling {
    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        Babbling b = new Babbling();

        System.out.println(b.solution(babbling));
    }

    public int solution(String[] babbling) {
        int answer = 0;

        for(int i=0; i<babbling.length; i++){
            String [] result = babbling[i].split("aya|ye|woo|ma");

            if (result.length == 0) {
                answer ++;
            }
        }

        return answer;
    }
}
