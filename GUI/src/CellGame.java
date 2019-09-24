import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class CellGame extends JFrame {
    static int x = 50;
    static int y = 50;
    static int xDirection = 0;
    static int yDirection = 0;
    static int radius=15;
    static int score = 0;
    static int setwidth=1300;
    static int setheight=1000;
    ArrayList<Jewel> jewels = new ArrayList<Jewel>();
    ArrayList<Boom> booms = new ArrayList<Boom>();
    public void Board(){
        setTitle("CellGame");
        setSize(setwidth,setheight);
        setVisible(true);
        for(int i=0;i<100;i++){
            jewels.add(new Jewel());
        }
        for(int i=0;i<10 ;i++){
            booms.add(new Boom());
        }
        Draw cell = new Draw();
        getContentPane().add(cell);
        MyListener myListener = new MyListener();
        addKeyListener(myListener);
    }
    public void start(){
        while (true) {
            repaint();
            x = x+xDirection;
            y = y+yDirection;
            int MyX = x + radius;
            int MyY = y + radius;
            int tx;
            int ty;
            double distance;
            for(Jewel jewel : jewels){
                tx = MyX - jewel.getX() + jewel.getWidth()/2;
                ty = MyY - jewel.getY() + jewel.getWidth()/2;
                distance = Math.sqrt(tx*tx + ty*ty);
                if(distance < radius){
                    radius++;
                    score++;
                    jewel.update();
                }
            }
           for(Boom boom : booms){
               tx = MyX - boom.getX() + boom.getWidth()/2;
               ty = MyY - boom.getY() + boom.getWidth()/2;
               distance = Math.sqrt(tx*tx + ty*ty);
                  if(distance < radius) {
                      radius--;
                      score--;
                      boom.update();
                  }
           }
            try{
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(score<0){
                break;
            }
        }
    }
    class Draw extends JPanel{
        public void paint(Graphics g){
            g.setColor(Color.red);
            g.fillOval(x,y,radius*2,radius*2);
            for(Jewel jewel : jewels) {
                g.setColor(jewel.getColor());
                g.fillRect(jewel.getX(), jewel.getY(), jewel.getWidth(), jewel.getWidth());
            }
            g.setColor(Color.black);
            g.drawString("Á¡¼ö"+score,20,20);
            for(Boom boom : booms){
                g.fillRect(boom.getX(),boom.getY(),boom.getWidth(),boom.getWidth());
            }
        }
    }

    class MyListener implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT :
                    if(xDirection > -3){
                        xDirection--;
                        yDirection = 0;
                    }
                    break;
                case KeyEvent.VK_RIGHT :
                    if(xDirection < 3){
                        xDirection++;
                        yDirection = 0;
                    }
                    break;
                case KeyEvent.VK_UP :
                    if(yDirection > -3){
                        xDirection = 0;
                        yDirection--;
                    }
                    break;
                case KeyEvent.VK_DOWN :
                    if(yDirection < 3){
                        xDirection = 0;
                        yDirection++;
                    }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    private class Jewel{
        private int x;
        private int y;
        private int width;
        private Color color;
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public int getWidth() {
            return width;
        }
        public Color getColor() {
            return color;
        }
        public void update() {
            x = (int)(Math.random()*setwidth);
            y = (int)(Math.random()*setheight);
            width = (int)(Math.random()* 5) + 15;
            color = new Color ((int)(Math.random() * 0xFFFFFF));
        }
        public Jewel() {
            x=(int)(Math.random()*setwidth);
            y=(int)(Math.random()*setheight);
            width = (int)(Math.random() * 5) +15;
            color = new Color((int)(Math.random()*0xFFFFFF));
        }
    }

    private class Boom{
        private int x;
        private int y;
        private int width;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getWidth() {
            return width;
        }
        public void update(){
            x = (int)(Math.random() *setwidth);
            y = (int)(Math.random() *setheight);
            width = 15;
        }
        public Boom(){
            x = (int)(Math.random()*setwidth);
            y = (int)(Math.random()*setheight);
            width = 15;
        }
    }

}
