import java.util.*;

public class s0430 {
    public static void main(String[] args) {
        String[] id_list ={"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k =2;
        
        
        int size = id_list.length;
        int[] answer = new int[size];
        int idx = 0;

        //중복 신고를 없애기 위해 HashSet 사용
        HashSet<String> ka = new HashSet<>();
        for(String rpt : report) ka.add(rpt);

        String[] ma = new String[ka.size()*2];

        for(String a : ka){
            ma[idx * 2] = a.split(" ")[0];
            ma[idx * 2 + 1] = a.split(" ")[1];
            idx++;
        }

        int s = 1;
        int o = 0;
        int[] ac = new int[id_list.length];
        List<String> kakao = Arrays.asList(id_list); //편하게 찾기위한 배열생성

        //신고 당한 횟수 구하기
        for(int i=1; i<ma.length; i+=2){
            ac[kakao.indexOf(ma[i])]++;
        }

        //신고문자 받는 횟수
        for(int i=0; i<id_list.length; i++){
            if(ac[i] >= k){
                String id = id_list[i];
                for(int j =1 ; j<ma.length; j+=2){
                    if(ma[j].equals(id)){
                        answer[kakao.indexOf(ma[j-1])]++;
                    }
                }
                
            }
        }

        for(int i=0; i<id_list.length; i++){
            System.out.print(answer[i]);
        }    
    }
}
