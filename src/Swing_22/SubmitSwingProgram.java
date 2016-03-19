package Swing_22;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by SerP on 19.03.2016.
 */
public class SubmitSwingProgram extends JFrame{
    JLabel label;
    static SubmitSwingProgram ssp;
    public SubmitSwingProgram()
    {
        super("Hello Swing");
        label = new JLabel("A label");
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 100);
        this.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp = new SubmitSwingProgram();
            }
        });
        TimeUnit.SECONDS.sleep(1);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp.label.setText("Normal!");
            }
        });
    }

}
