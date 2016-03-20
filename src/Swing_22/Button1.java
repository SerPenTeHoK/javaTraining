package Swing_22;

import javax.swing.*;
import java.awt.*;

import static Swing_22.SwingConsole.run;

/**
 * Created by SerP on 20.03.2016.
 */
public class Button1 extends JFrame {
    private JButton
            b1 = new JButton("Button 1"),
            b2 = new JButton("Button 2");

    public Button1() {
        setLayout(new FlowLayout());
        this.add(b1);
        this.add(b2);
    }

    public static void main(String[] args) {
        run(new Button1(), 200, 100);
    }
}
