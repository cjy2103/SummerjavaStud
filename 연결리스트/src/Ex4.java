import java.util.LinkedList;

public class Ex4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1;i<101;i++){
            list.add(i);
        }
        list.remove(3);
        System.out.println(list);
    }
}
