/** 
 * s0426
 * 프로그래머스
 * 
 * 전체 학생의 수 n
 * 도난 당한 학생들의 번호 배열 lost
 * 여벌의 체육복이 있는 학생의 번호 배열 reserve
 * 
 * 체육복
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 **/

public class s0426 {
    static int n = 5;
    static int[] lost = {2,4};
    static int[] reserve = {1,3};
    public static void main(String[] args) {
        int[] people = new int[n];

        int answer = n;

        //체육복을 도난 당한 학생
        for (int l : lost) 
            people[l-1]--;          

        //여벌의 체육복이 있는 학생   
        for (int r : reserve) 
            people[r-1]++;
        
        //여벌의 체육복이 있는 학생이 양 옆의 번호에게 빌려주기
        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) { 
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else 
                    answer--;
            }
        }
        System.out.print(answer);
    }
} 