/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/134240
 * 프로그래머스 푸드 파이트 대회
 */

public class Food {
    public static void main(String[] args) {
        int [] food = {1, 3, 4, 6};
        String left = "";
        String right = "";
        for(int i=0; i<food.length; i++){
            for(int j=1; j<=food[i]/2; j++){
                left += String.valueOf(i);
            }
        }

        for(int i=left.length()-1; i>-1; i--){
            right += left.charAt(i);
        }

        System.out.println(left + "0" + right);
    }
}
