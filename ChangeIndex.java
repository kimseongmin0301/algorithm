/**
 * 프로그래머스
 * 인덱스바꾸기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120895
 */
public class ChangeIndex {
    public static void main(String[] args) {
        String my_string = "hello";
        int num1 = 1, num2 = 2;
        String[] arr = my_string.split("");

        String temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

        System.out.println(String.join("", arr));
    }
}