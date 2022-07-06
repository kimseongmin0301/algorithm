/**
 * 프로그래머스
 * [1차] 다트 게임
 */
public class Dart {
    public static void main(String[] args) {
        String dartResult = "1D2S3T*";
        int[] answer = new int[3];
        int cnt = 0;
        String num = "";
        for(int i=0; i<dartResult.length(); i++){
                switch (dartResult.charAt(i)) {
                    case 'S':
                        answer[cnt] =(int)Math.pow(Integer.parseInt(num),1);
                        cnt++;
                        num = "";
                        break;
                    case 'D':
                        answer[cnt] =(int)Math.pow(Integer.parseInt(num),2);
                        cnt++;
                        num = "";
                        break;
                    case 'T':
                        answer[cnt] =(int)Math.pow(Integer.parseInt(num),3);
                        cnt++;
                        num = "";
                        break;
                    case '*':
                        answer[cnt-1] *= 2;
                        if(cnt > 1) { answer[cnt-2] *= 2; }
                        break;
                    case '#':
                        answer[cnt-1] *= (-1);
                        break;
                    default:
                        num += String.valueOf(dartResult.charAt(i));
                        break;
            }
        }
        int result = 0;
        for(int i=0; i<answer.length; i++){
            result += answer[i];
        }
        System.out.print(result);
    }
}
