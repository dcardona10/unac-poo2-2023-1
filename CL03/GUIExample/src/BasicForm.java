import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicForm {
    public JPanel pnlMain;
    private JTextField txtName;
    private JLabel lblID;
    private JTextField txtID;
    private JButton btnShow;
    private JTextField txtShow;
    private JLabel lblName;

    public BasicForm() {
        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtShow.setText("User " + txtName.getText() + " with ID " + txtID.getText());
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
