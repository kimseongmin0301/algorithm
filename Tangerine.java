import java.util.*;

public class Tangerine {
    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

        Tangerine t = new Tangerine();
        System.out.println(t.solution(k, tangerine));
    }

    public int solution(int k, int[] tangerine){
        int answer = 0;
        Map<Integer, Integer> sizeMap = new HashMap<>();

        // 1. sizeMap data set (귤 사이즈별로 정리)
        for(int size : tangerine) {
            sizeMap.put(size, sizeMap.getOrDefault(size, 0)+1);
        }

        System.out.println("sizeMap : " + sizeMap);

        // 2. keyList 생성 (사이즈별 list)
        List<Integer> keyList = new ArrayList<>(sizeMap.keySet());

        System.out.println("keyList : " + keyList);

        // 3. keyList의 value 기준 내림차순 정렬 (사이즈별 총개수 내림차순 list로 만들어줌)
        keyList.sort((o1, o2) -> sizeMap.get(o2) - sizeMap.get(o1));

        System.out.println("keyList 내림차순 : " + keyList);

        // 4. k의 개수만큼 상자에 담으며 최소값 추출
        int i = 0;
        while(k > 0){
            k -= sizeMap.get(keyList.get(i));
            answer++;
            i++;
        }

        return answer;
    }
}
