import co.edu.unac.poo2.cl03.Figure;
import co.edu.unac.poo2.cl03.impl.Circle;
import co.edu.unac.poo2.cl03.impl.Rectangle;
import co.edu.unac.poo2.cl03.impl.Square;
import co.edu.unac.poo2.cl03.impl.Triangle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Figures {
    public JPanel pnlMain;
    private JLabel lblChoice;
    private JRadioButton rbtnCircle;
    private JRadioButton rbtnRectangle;
    private JRadioButton rbtnSquare;
    private JRadioButton rbtnTriangle;
    private JLabel lblBase;
    private JTextField txtBase;
    private JLabel lblHeight;
    private JTextField txtHeight;
    private JButton btnCalculate;
    private JLabel lblArea;
    private JTextField txtArea;
    private ButtonGroup buttonGroup = new ButtonGroup();

    private int option = 0;
public Figures() {

    buttonGroup.add(rbtnCircle);
    buttonGroup.add(rbtnRectangle);
    buttonGroup.add(rbtnSquare);
    buttonGroup.add(rbtnTriangle);

    rbtnCircle.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            option = 1;
            System.out.println(option);
            txtHeight.setEnabled(false);
        }
    });
    rbtnRectangle.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            option = 2;
            System.out.println(option);
            txtHeight.setEnabled(true);
        }
    });
    rbtnSquare.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            option = 3;
            System.out.println(option);
            txtHeight.setEnabled(false);
        }
    });
    rbtnTriangle.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            option = 4;
            System.out.println(option);
            txtHeight.setEnabled(true);
        }
    });
    btnCalculate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (option) {
                case 1:
                    Circle circle = new Circle();
                    circle.setBase(Double.parseDouble(txtBase.getText()));
                    txtArea.setText(String.valueOf(circle.calculateArea()));
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle();
                    rectangle.setBase(Double.parseDouble(txtBase.getText()));
                    rectangle.setHeight(Double.parseDouble(txtHeight.getText()));
                    txtArea.setText(String.valueOf(rectangle.calculateArea()));
                    break;
                case 3:
                    Square square = new Square();
                    square.setBase(Double.parseDouble(txtBase.getText()));
                    txtArea.setText(String.valueOf(square.calculateArea()));
                    break;
                case 4:
                    Triangle triangle = new Triangle();
                    triangle.setBase(Double.parseDouble(txtBase.getText()));
                    triangle.setHeight(Double.parseDouble(txtHeight.getText()));
                    txtArea.setText(String.valueOf(triangle.calculateArea()));
                    break;
            }
        }
    });
}
}
