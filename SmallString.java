/**
 * 크기가 작은 부분문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */

public class SmallString {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        int answer = 0;

        for(int i=0; i<t.length() - (p.length()-1); i++){
            if(Long.parseLong(t.substring(i, p.length()+i)) <= Long.parseLong(p)){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
