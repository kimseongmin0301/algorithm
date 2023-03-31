import java.util.Arrays;

public class Park {
        static int[][] dir = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} }; // 북, 남, 서, 동
        static int h, w;

        public int[] solution(String[] park, String[] routes) {
            h = park.length;
            w = park[0].length();

            int[] pos = getStartPosition(park);
            for (String route : routes) {
                char[] r = route.toCharArray();
                int d = getDirection(r[0]);
                int dist = r[2] - '0';
                int[] nextPos = getNextPosition(pos, d, dist, park);
                if (nextPos == null) continue;
                pos = nextPos;
            }

            return pos;
        }

        private int[] getStartPosition(String[] park) {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (park[i].charAt(j) == 'S') {
                        return new int[] {i, j};
                    }
                }
            }
            return null;
        }

        private int getDirection(char d) {
            switch(d) {
                case 'N': return 0;
                case 'S': return 1;
                case 'W': return 2;
                case 'E': return 3;
            }
            return -1;
        }

        private int[] getNextPosition(int[] pos, int d, int dist, String[] park) {
            int r = pos[0], c = pos[1];
            while (dist-- > 0) {
                r += dir[d][0];
                c += dir[d][1];
                if (r < 0 || r >= h || c < 0 || c >= w || park[r].charAt(c) == 'X') {
                    return null;
                }
            }
            return new int[] {r, c};
        }
}
