import com.sun.prism.Graphics;

import javax.swing.*;
import java.awt.*;

/**
 * Created by DELL on 08/09/2022.
 */
public class Q7 extends JComponent {
    public void paintComponent (java.awt.Graphics g)
    {
        Graphics2D g2=(Graphics2D)g;
        Rectangle box=new Rectangle(50,50,100,100);
        g2.draw(box);
        g2.fill(box);
        g2.setColor(Color.pink);

        Rectangle box2=new Rectangle(50,200,100,100);
        g2.draw(box2);
        g2.fill(box2);
        g2.setColor(Color.blue);





    }

}
