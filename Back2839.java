import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Back2839
 */
public class Back2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        System.out.println(suger(k));
    }
    
    static int suger(int k){
        if(k == 4 || k == 7){
            return -1;
        }else if(k % 5 == 0){
            return k / 5;
        }else if(k % 5 == 1 || k % 5 == 3){
            return k / 5 + 1;
        }else if(k % 5 == 2 || k % 5 == 4){
            return k / 5 + 2;
        }else{
            return -1;
        }
    }
}