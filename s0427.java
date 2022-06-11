/** 
 *  프로그래머스
 *  주식가격
 *  https://programmers.co.kr/learn/courses/30/lessons/42584
 **/

public class s0427 {
    public static void main(String[] args) {
        int [] prices = {1,2,3,2,3};
        int [] answer = new int[prices.length];
        
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                answer[i]++;
                if(prices[i] > prices[j]) break;                
            }
        }        

        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
 