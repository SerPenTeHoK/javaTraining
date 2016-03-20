package Swing_22;

/**
 * Created by SerP on 20.03.2016.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Swing_22.SwingConsole.run;


public class Button2b extends JFrame {
    private JButton
            b1 = new JButton("Button 1"),
            b2 = new JButton("Button 2"),
            b3 = new JButton("Button 3");
    private JTextField txt = new JTextField(10);
    private ActionListener bu1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton)e.getSource()).getText();
            txt.setText(name);
        }
    };

    public Button2b() {
        b1.addActionListener(bu1);
        b2.addActionListener(bu1);
        b3.addActionListener(bu1);
        setLayout(new FlowLayout());
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(txt);
    }

    public static void main(String[] args) {
        run(new Button2b(), 200, 150);
    }
}

