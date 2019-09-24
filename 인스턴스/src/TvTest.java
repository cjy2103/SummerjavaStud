public class TvTest {
    public static void main(String[] args) {
    Tv t;
    t = new Tv();
    t.chanel = 9;
    System.out.println(t.chanel);
    t.channelUp();
    System.out.println(t.chanel);
    t.channelDown();
    System.out.println(t.chanel);
    System.out.println(t.power);
    t.power();
    System.out.println(t.power);
    System.out.println(t.color);
    t.color="파랑";
    System.out.println(t.color);
    }
}
