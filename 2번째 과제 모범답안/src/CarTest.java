public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.vehicle = "Ʈ��";
        car1.power();
        car1.speed = 60;
        car1.speedUp();
        car1.speedUp();
        System.out.println("����: "+car1.vehicle+"\n�õ�����: "+car1.power+"\n�ӵ�: "+car1.speed);
        car2.vehicle = "�ڰ���";
        car2.power();
        car2.speed = 80;
        car2.speedDown();
        car2.speedDown();
        System.out.println("����: "+car2.vehicle+"\n�õ�����: "+car2.power+"\n�ӵ�: "+car2.speed);
    }
}
