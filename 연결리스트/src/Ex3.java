import java.util.LinkedList;

public class Ex3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<1000000;i++){
            list.add((int)(Math.random()*100)+(int)(Math.random()*2));
        }
        System.out.println(list.get(99999));
    }
}
