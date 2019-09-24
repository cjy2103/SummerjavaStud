import java.util.LinkedList;

public class Ex10 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<1000000;i++){
            list.add((int)(Math.random()*50)+(int)(Math.random()*2));
        }
        System.out.println(list.get(25000));
    }
}
