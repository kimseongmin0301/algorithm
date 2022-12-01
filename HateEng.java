/**
 * 프로그래머스
 * 영어가 싫어요
 * https://school.programmers.co.kr/learn/courses/30/lessons/120894
 */
public class HateEng {
    public static void main(String[] args) {
        Solution s = new Solution();

        s.solution("onefourzerosixseven");
    }
}
class Solution {
    String [] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public void solution(String numbers) {
        String a = "";

        for(String str : num){
            numbers = numbers.replaceAll(str, findNum(str));
            a = numbers;
        }
        System.out.println(a);
    }

    public String findNum(String str){
        int cnt = 0;
        for(String s : num){
            if(str.equals(s)){
                break;
            }
            cnt++;
        }

        return String.valueOf(cnt);
    }
}