import javax.swing.*;

/**
 * Created by DELL on 08/09/2022.
 */
public class Q7frame {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setTitle("box");
        frame.setVisible(true);

        Q7 component=new Q7();
        frame.add(component);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
