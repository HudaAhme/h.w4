import javax.swing.*;
import java.awt.*;

/**
 * Created by DELL on 09/09/2022.
 */
public class Q8 extends JComponent {
    public void paintComponent (java.awt.Graphics g)
    {
        Graphics2D g2=(Graphics2D)g;

        Rectangle r=new Rectangle(100,100,100,200);
        g2.setColor(Color.blue);
        g2.draw(r);
        g2.fill(r);
        g2.setColor(Color.red);


        g2.drawString("HUDA",100,100);
     ;


    }

}
