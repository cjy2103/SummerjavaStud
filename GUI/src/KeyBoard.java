import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard extends JFrame {
    static int x = 50;
    static int y = 50;
    static int xDirection = 0;
    static int yDinrection = 0;
    public void Board (){
        setTitle("KeyAction");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,1000);
        setVisible(true);
        Draw scatch = new Draw();
        MyListner listner = new MyListner();
        add(scatch);
        addKeyListener(listner);
    }
    public void start(){
        while (true){
            repaint();
            x=x+xDirection;
            y=y+yDinrection;
            try{
                Thread.sleep(10);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    class MyListner implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    if(xDirection>-3) {
                        xDirection--;
                        yDinrection = 0;
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if(xDirection<3) {
                        xDirection++;
                        yDinrection=0;
                    }
                    break;
                case KeyEvent.VK_UP:
                    if(yDinrection>-3){
                        xDirection=0;
                        yDinrection--;
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(yDinrection<3){
                        xDirection=0;
                        yDinrection++;
                    }
                    break;
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
    class Draw extends JPanel{
        public void paint(Graphics g){
            g.setColor(Color.YELLOW);
            g.fillOval(x,y,100,100);
        }
    }
}
