/**
 * 프로그래머스
 * 숨어있는 숫자의 덧셈 (2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120864
 */
public class HiddenNum {
    public static void main(String[] args) {
        String str = "aAb1B2cC34oOp";
        int answer = 0;
        String [] arr = str.replaceAll("[a-zA-z]", " ").split(" ");
        for(String s : arr){
            if(!s.equals("")){
                answer += Integer.parseInt(s);
            }
        }
        System.out.println(answer);
    }
}
