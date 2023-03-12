import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.getContentPane().add(new Calculator().getPnlMain());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}