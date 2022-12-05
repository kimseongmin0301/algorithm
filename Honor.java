import java.util.*;

public class Honor {
    public static void main(String[] args) {
        int [] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int k = 4;
        int [] answer = new int[score.length];

        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<score.length; i++){
            if(i<k-1){
                arr.add(score[i]);
                arr.sort(Collections.reverseOrder());
                answer[i] = arr.get(arr.size()-1);
            } else{
                arr.add(score[i]);
                arr.sort(Collections.reverseOrder());
                answer[i] = arr.get(k-1);
            }
        }
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//
//        int temp = 0;
//
//        for(int i = 0; i < score.length; i++) {
//
//            priorityQueue.add(score[i]);
//            if (priorityQueue.size() > k) {
//                priorityQueue.poll();
//            }
//            System.out.println(priorityQueue);
//            answer[i] = priorityQueue.peek();
//        }
//
//        for(int i=0; i<score.length; i++){
//            System.out.println(answer[i]);
//        }

    }
}
