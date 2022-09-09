import javax.swing.*;

/**
 * Created by DELL on 08/09/2022.
 */
public class perimtertesterQ1 {
    public static void main(String[] args) {
        JFrame myframe=new JFrame();
        myframe.setSize(800,800);
        myframe.setTitle("your rectangle");

        rectangle m=new rectangle();
        myframe.add(m);





        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
