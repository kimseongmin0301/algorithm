/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120817
 *
 * 프로그래머스 배열의 평균값
 */
public class ArrayAverage {
    static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8,9 ,10};

    public static void main(String[] args) {
        ArrayAverage average = new ArrayAverage();

        System.out.println(average.solution(numbers));
    }

    public double solution(int[] numbers){
        double answer = 0;
        double s = 0;
        for(double sum : numbers){
            s += sum;
        }

        answer = s/numbers.length;

        return answer;
    }
}
