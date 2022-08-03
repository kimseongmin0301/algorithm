import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> st = new Stack<>();

        String s =br.readLine();
        int cnt = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(c);
            }else if(st.empty()){
               cnt++;
            }else{
                st.pop();
            }
        }
        System.out.println(st.size() + cnt);
    }
}
