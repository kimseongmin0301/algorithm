/**
 * 프로그래머스
 * 피로도
 * dfs 어렵다
 * 이해가 될거 같으면서도 안된다 왠지 모른다 어렵다
 */
public class Solution {
    static int answer = 0;
    static boolean[] visited;

    public static void main(String[] args) {
        Solution test = new Solution();
        int[][] d = {{80,20},{50,40,},{30,10}};
        System.out.print(test.solution(80, d));
    }

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return answer;
    }

    public void dfs(int depth,int k, int[][] dungeons){
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && dungeons[i][0] <= k){
                visited[i] = true;

                dfs(depth+1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }
}
