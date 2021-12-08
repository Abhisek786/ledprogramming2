package MainScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInScreenHidePW extends JFrame implements ActionListener {
    JLabel un = new JLabel("User Name:- ");
    JLabel pw = new JLabel("Password:- ");
    JTextField UN = new JTextField();
    JPasswordField PW = new JPasswordField();
    JCheckBox sh = new JCheckBox("show");
    JButton login = new JButton("LogIn");

    public LogInScreenHidePW() {
        setTitle("LogIn");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 300, 500, 500);
        setLayout(null);

        un.setBounds(100, 100, 100, 50);
        pw.setBounds(100, 130, 100, 50);
        UN.setBounds(200, 115, 150, 20);
        PW.setBounds(200, 145, 150, 20);
        sh.setBounds(350, 145, 100, 20);
        login.setBounds(200, 175, 100, 20);

        add(un);
        add(pw);
        add(UN);
        add(PW);
        add(sh);
        add(login);
        sh.addActionListener(this);
        login.addActionListener(this);
    }
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == sh) {
            if (sh.isSelected())
                PW.setEchoChar((char) 0);
            else
                PW.setEchoChar('^');
        }
        if (a.getSource() == login) {
            String name = UN.getText();
            JOptionPane.showMessageDialog(null, "Hello User " + name);
            dispose();

        }
    }
    public static void main(String[] args) {
        new LogInScreenHidePW().setVisible(true);
    }
}
