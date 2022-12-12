/**
 * 프로그래머스
 * 컨트롤 제트
 * https://school.programmers.co.kr/learn/courses/30/lessons/120853?language=java
 */
public class CtrlZ {
    public static void main(String[] args) {
        String s = "1 2 Z 3";
        String [] str = s.split(" ");
        int answer = 0;

        for(int i=0; i<str.length; i++){
            if(str[i].equals("Z")){
                answer -= Integer.parseInt(str[i-1]);
            }else{
                answer += Integer.parseInt(str[i]);
            }
        }

        System.out.println(answer);
    }
}
