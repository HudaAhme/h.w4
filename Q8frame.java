import javax.swing.*;

/**
 * Created by DELL on 09/09/2022.
 */
public class Q8frame{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setTitle("name");
        frame.setVisible(true);

        Q8 component=new Q8();
        frame.add(component);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
