import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListner extends JFrame {
    static int x = 0;
    Label label;
    public void Board(){
        setTitle("MouseListner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        JButton button = new JButton("Å¬¸¯");
        Label label = new Label("0");
        this.setLayout(new FlowLayout());
        this.add(button);
        this.add(label);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x++;
                label.setText(Integer.toString(x));
            }
        });
    }
}
