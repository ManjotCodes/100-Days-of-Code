import javax.swing.*;
import java.awt.*;

class Solution {
    Manjot() {
        JFrame f = new JFrame();
        Label l = new Label("Reg No :");
        Button b = new Button("Submit");
        TextField t = new TextField();

        l.setBounds(20, 80, 80, 30);
        t.setBounds(20, 100, 80, 30);
        b.setBounds(100, 100, 80, 30);

        f.add(b);
        f.add(l);
        f.add(t);

        f.setSize(400,300);
        f.setTitle("Employee info");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        Manjot awt_obj = new Manjot();

    }

}
