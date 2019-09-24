public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.vehicle = "트럭";
        car1.power();
        car1.speed = 60;
        car1.speedUp();
        car1.speedUp();
        System.out.println("차종: "+car1.vehicle+"\n시동상태: "+car1.power+"\n속도: "+car1.speed);
        car2.vehicle = "자가용";
        car2.power();
        car2.speed = 80;
        car2.speedDown();
        car2.speedDown();
        System.out.println("차종: "+car2.vehicle+"\n시동상태: "+car2.power+"\n속도: "+car2.speed);
    }
}
