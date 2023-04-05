public class Cards {
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards1, cards2, goal));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal){
        String answer = "Yes";

        int idx1 = 0;
        int idx2 = 0;

        for (String s : goal) {
            if (cards1.length > idx1 && s.equals(cards1[idx1])) {
                idx1++;
            } else if (cards2.length > idx2 && s.equals(cards2[idx2])) {
                idx2++;
            } else {
                return "No";
            }
        }

        return answer;
    }

}
