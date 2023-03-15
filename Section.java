public class Section {
    public static void main(String[] args) {
        int n = 8, m = 4;
        int[] section = {2, 3, 6};

        System.out.println(solution(n, m, section));
    }

    static int solution(int n, int m, int[] section) {
        int answer = 0;
        int max = 0;

        for(int i=0; i<section.length; i++){
            int s = section[i];
            if(s > max){
                answer++;
                max = s + m - 1;
            }
        }

        return answer;
    }
}
