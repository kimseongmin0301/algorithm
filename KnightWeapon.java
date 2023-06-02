public class KnightWeapon {
    public static void main(String[] args) {
        int number = 10;
        int limit = 3;
        int power = 2;

        System.out.println(solution(number, limit, power));
    }

    static int solution(int number, int limit, int power) {
        int answer = 0;
        int [] knight = new int[number];

        for(int i = 1; i <= number; i++) {
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    knight[i-1]++;
                }
            }

            if(knight[i-1] > limit) {
                knight[i-1] = power;
            }

            answer += knight[i-1];
        }

        return answer;
    }
}
