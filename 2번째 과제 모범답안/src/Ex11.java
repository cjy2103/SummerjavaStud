import java.util.LinkedList;

public class Ex11 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1;i<=150;i++){
            list.add(i);
        }
        list.remove(2);
        list.remove(8);
        System.out.println(list);
    }
}
