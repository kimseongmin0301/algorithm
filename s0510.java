/*
 *  프로그래머스 최소직사각형
 *  https://programmers.co.kr/learn/courses/30/lessons/86491
 * 
 *  간단한 문제인데 나는 왜 머리가 안돌아갈까
 * 
 *  돌고 돌아 풀었다.
 */
public class s0510 {
    public static void main(String[] args) {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};

        int w = 0, h = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int num = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = num;
            }
            for(int j=0; j<sizes[i].length; j++){
                if(w < sizes[i][0])
                    w = sizes[i][0];
                if(h < sizes[i][1])
                    h = sizes[i][1];
            }
        }
        System.out.print(w * h);
    }
}
