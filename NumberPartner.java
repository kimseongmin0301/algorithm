/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/131128
 * 프로그래머스 숫자 짝꿍
 */
public class NumberPartner {
    public static void main(String[] args) {
        String X = "12321";
        String Y = "42531";
        String answer = "";

        int [] xArr = new int[10];
        int [] yArr = new int[10];

        for(String x : X.split("")) xArr[Integer.parseInt(x)]++;
        for(String y : Y.split("")) yArr[Integer.parseInt(y)]++;

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--){
            while(xArr[i] > 0 && yArr[i] > 0){
                sb.append(i);
                xArr[i]--;
                yArr[i]--;
            }
        }
        if("".equals(sb.toString())){
            answer = "-1";
        } else if("0".equals(sb.toString().substring(0,1))){
            answer = "0";
        } else{
            answer = sb.toString();
        }

        System.out.println(answer);
    }
}
