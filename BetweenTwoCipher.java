public class BetweenTwoCipher {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        System.out.println(solution(s, skip, index));
    }

    static String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for(char c : s.toCharArray()) {
            int cnt = 1;
            while(cnt <= index) {
                ++c;
                if(c > 'z') {
                    c -= 26;
                }

                if (!skip.contains(String.valueOf(c))) {
                    cnt++;
                }
            }
            answer.append(c);
        }

        return answer.toString();
    }
}