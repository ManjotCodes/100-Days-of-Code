import javax.swing.*;
import java.awt.*;

public class Solution {

    public static void main(String[] args) {


        ImageIcon image = new ImageIcon("W.png");
        JLabel label = new JLabel();
        label.setText("My first Frame!!");
        label.setIcon(image);


        JFrame frame = new JFrame();  //instance of JFrame class
        frame.setSize(500,500); //Sets dimension of frame
        frame.setVisible(true);  //Visibility of frame
        frame.setTitle("My First frame");  //Title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Close operation of frame
        frame.getContentPane().setBackground(new Color(123,50,250));
        frame.add(label);


    }

}
