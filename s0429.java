/*
 *  TreeSet을 이용한 최댓값과 몇 번째인지 구하기
 *  백준 최댓값(2562)
 *  https://www.acmicpc.net/problem/2562
 *  
 *  Scanner를 오랜만에 써서 헷갈리고
 *  배열에 들어가면 자동 정렬되는 TreeSet을 이용했다.
 * 
 *  다른 풀이 보니까 BufferedReader라는게 있던데 한번 찾아봐야겠다.
 *  메모리는 덜잡아먹고 속도는 빠름.
 *  스캐너보다 빠른듯..?
 */
import java.util.Scanner;
import java.util.TreeSet;

public class s0429 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int big = 0;
        int rank = 0;

        TreeSet<Integer> num = new TreeSet<>();

        for(int i=0; i<9; i++){
            int n = sc.nextInt();
            num.add(n);
            
            if(big < n){
                big = n;
                rank = i+1;  
            } 
        }

        System.out.println(num.last());
        System.out.println(rank);

    }
}
