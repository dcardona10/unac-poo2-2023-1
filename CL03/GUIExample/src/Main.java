import co.edu.unac.poo2.cl03.Figure;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*BasicForm form = new BasicForm();
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(form.pnlMain);
        frame.pack();
        frame.setVisible(true);*/

        Figures figures = new Figures();
        JFrame frame = new JFrame("Figures");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(figures.pnlMain);
        frame.pack();
        frame.setVisible(true);
    }
}