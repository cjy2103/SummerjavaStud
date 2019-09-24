
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListner extends JFrame {
    static int x = 0;
    public void Board(){
        setTitle("MouseListner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("초기상태 = 0");
        button.setPreferredSize(new Dimension(60,40));
        button.addActionListener(new MyListner());
        setVisible(true);
        setSize(500,500);
        add(button);
    }
    class MyListner implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
           x++;
           button.setText(Integer.toString(x));
        }
    }

}
