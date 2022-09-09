import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by DELL on 09/09/2022.
 */
public class Q9 extends JComponent{
    public void paintComponent (java.awt.Graphics g)
    {
        Graphics2D g2=(Graphics2D)g;

        Rectangle rectangle=new Rectangle(100,100,100,250);
        g2.draw(rectangle);
        g2.fill(rectangle);

        Ellipse2D.Double circle1=new Ellipse2D.Double(120,140,50,50);
        g2.draw(circle1);
        g2.setColor(Color.red);
        g2.fill(circle1);

        Ellipse2D.Double circle2=new Ellipse2D.Double(120,200,50,50);
        g2.draw(circle2);
        g2.setColor(Color.yellow);
        g2.fill(circle2);

        Ellipse2D.Double circle3=new Ellipse2D.Double(120,260,50,50);
        g2.draw(circle3);
        g2.setColor(Color.green);
        g2.fill(circle3);


    }



}
