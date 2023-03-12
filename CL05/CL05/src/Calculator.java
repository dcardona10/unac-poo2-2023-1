import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel pnlMain;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnSum;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnSub;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnMul;
    private JButton btn0;
    private JButton btnEq;
    private JButton btnAC;
    private JButton btnDiv;
    private JTextField txtScreen;

    private static final String STR_1 = "1";
    private static final String STR_2 = "2";
    private static final String STR_3 = "3";
    private static final String STR_4 = "4";
    private static final String STR_5 = "5";
    private static final String STR_6 = "6";
    private static final String STR_7 = "7";
    private static final String STR_8 = "8";
    private static final String STR_9 = "9";
    private static final String STR_0 = "0";

    private static final int OPER_SUM = 1;
    private static final int OPER_SUB = 2;
    private static final int OPER_MUL = 3;
    private static final int OPER_DIV = 4;

    private String screen = "";
    private double a = 0.0;
    private double b = 0.0;
    private double result = 0.0;
    private int option = 0;

    private void addTextToScreen(String num) {
        screen += num;
        txtScreen.setText(screen);
    }

    private void saveOperation(String num, int opt) {
        try {
            a = Double.parseDouble(num);
            option = opt;
            screen = "";
            txtScreen.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cannot convert string to number");
        }
    }

    private void executeOperation() {
        try {
            b = Double.parseDouble(screen);
            switch (option) {
                case OPER_SUM -> result = a + b;
                case OPER_SUB -> result = a - b;
                case OPER_MUL -> result = a * b;
                case OPER_DIV -> result = a / b;
            }
            txtScreen.setText(String.valueOf(result));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cannot convert string to number");
        }
    }

    private void reset() {
        txtScreen.setText("");
        screen = "";
        a = 0.0;
        b = 0.0;
        result = 0.0;
        option = 0;
    }

public Calculator() {
    btn1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            addTextToScreen(STR_1);
        }
    });
    btn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            addTextToScreen(STR_2);
        }
    });
    btn3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            addTextToScreen(STR_3);
        }
    });
    btn4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            addTextToScreen(STR_4);
        }
    });
    btn5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            addTextToScreen(STR_5);
        }
    });
    btn6.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            addTextToScreen(STR_6);
        }
    });
    btn7.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            addTextToScreen(STR_7);
        }
    });
    btn8.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            addTextToScreen(STR_8);
        }
    });
    btn9.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            addTextToScreen(STR_9);
        }
    });
    btn0.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            addTextToScreen(STR_0);
        }
    });
    btnSum.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            saveOperation(screen, OPER_SUM);
        }
    });
    btnSub.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            saveOperation(screen, OPER_SUB);
        }
    });
    btnMul.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            saveOperation(screen, OPER_MUL);
        }
    });
    btnDiv.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            saveOperation(screen, OPER_DIV);
        }
    });
    btnEq.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            executeOperation();
        }
    });
    btnAC.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            reset();
        }
    });
}

    public JPanel getPnlMain() {
        return pnlMain;
    }
}
