import javax.swing.*;
import java.awt.*;

/**
 * Created by DELL on 08/09/2022.
 */
public class rectangle extends JComponent {
    public void paintComponent (Graphics g)
    {
        Graphics2D g2=(Graphics2D)g;

        Rectangle m=new Rectangle(400,600);
        m.getHeight();
       m.getWidth();



        g2.draw(m);

    }




}
