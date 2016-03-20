package Swing_22;

/**
 * Created by SerP on 20.03.2016.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Swing_22.SwingConsole.run;


public class Button2 extends JFrame {
    private JButton
            b1 = new JButton("Button 1"),
            b2 = new JButton("Button 2");
    private JTextField txt = new JTextField(10);
    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton)e.getSource()).getText();
            txt.setText(name);
        }


    }
    private ButtonListener bu1 = new ButtonListener();
    public Button2() {
        b1.addActionListener(bu1);
        b2.addActionListener(bu1);
        setLayout(new FlowLayout());
        this.add(b1);
        this.add(b2);
        this.add(txt);
    }

    public static void main(String[] args) {
        run(new Button2(), 200, 100);
    }
}
