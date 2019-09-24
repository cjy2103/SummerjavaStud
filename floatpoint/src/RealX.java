import java.math.BigDecimal;

public class RealX {
    public static void main(String[] args){
      BigDecimal x =  new BigDecimal("5");
      BigDecimal y = new BigDecimal("0");
      BigDecimal c = new BigDecimal("20");
      BigDecimal d = new BigDecimal("10");
      BigDecimal e = new BigDecimal("0.2");
       while (x.compareTo(d)<0) {
           y = y.add(x.multiply(x));
           y = y.add(x.add(x));
           y = y.subtract(c);
           x = x.add(e);
           System.out.println(y);
           System.out.println(x);
       }
    }
}
