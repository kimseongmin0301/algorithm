import java.util.*;
import java.util.stream.Collectors;

class Worker {
    private String name;
    private String job;

    public Worker(String name, String job){
        this.name = name;
        this.job = job;
    }

    public String getName(){
        return this.name;
    }

    public String getJob(){
        return this.job;
    }
}

public class Job{
    static Worker[] data;

    static String findByName(String job){
        List<String> s = new ArrayList<>();

        for(Worker w : data){
            if(w.getJob().equals(job)){
                s.add(w.getName());
            }
        }

        return s.stream().collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String name, job;

        System.out.print("사람 숫자 : ");
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        data = new Worker[people];

        for(int i=0; i<people; i++){
            System.out.print("이름 : ");
            name = sc.nextLine();
            System.out.print("직업 : ");
            job = sc.nextLine();
            data[i] = new Worker(name, job);
        }

        System.out.print("찾고 싶은 직업 : ");
        job = sc.nextLine();

        if(findByName(job).equals("")){
            System.out.println("찾는 직업이 없습니다.");
        } else{
            System.out.println("찾는 직업을 가진 사람의 이름은 " + findByName(job) + " 입니다.");
        }
    }
}
