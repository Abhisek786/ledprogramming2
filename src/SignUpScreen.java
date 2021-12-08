

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpScreen extends JFrame implements ActionListener {
    JLabel fn = new JLabel("First Name:- ");
    JLabel ln = new JLabel("Last Name:- ");
    JLabel em = new JLabel("E-Mail:- ");
    JLabel ge = new JLabel("Gender:- ");
    JLabel DOB = new JLabel("Date Of Birth:- ");
    JLabel pw = new JLabel("Password:- ");
    JLabel cpw = new JLabel("Confirm Password:- ");

    JTextField FN = new JTextField();
    JTextField LN = new JTextField();
    JTextField EM = new JTextField();
    JTextField GE = new JTextField();
    JTextField dob = new JTextField();
    JTextField PW = new JTextField();
    JTextField CPW = new JTextField();

    JButton btn = new JButton("Submit");

    public SignUpScreen() {
        // Setting up the window to work on
        setTitle("Sign Up");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 100, 400,400);
        setLayout(null);
        btn.addActionListener(this);

        // Inside the window
        // Labels
        fn.setBounds(0,50, 100, 100);
        ln.setBounds(0, 80, 100, 100);
        em.setBounds(0, 110, 100, 100);
        ge.setBounds(0, 140, 100, 100);
        DOB.setBounds(0, 170, 100, 100);
        pw.setBounds(0, 200, 100, 100);
        cpw.setBounds(0, 230, 150, 100);

        btn.setBounds(120, 320, 100, 20);

        // Text boxes
        FN.setBounds(120, 95, 150, 20);
        LN.setBounds(120, 125, 150, 20);
        EM.setBounds(120, 155, 150, 20);
        GE.setBounds(120, 185, 150, 20);
        dob.setBounds(120, 215, 150, 20);
        PW.setBounds(120, 245, 150, 20);
        CPW.setBounds(120, 275, 150, 20);

        add(btn);

        // Initializing boxes
        add(FN);
        add(LN);
        add(EM);
        add(GE);
        add(dob);
        add(PW);
        add(CPW);

        // Initializing labels
        add(fn);
        add(ln);
        add(em);
        add(ge);
        add(DOB);
        add(pw);
        add(cpw);
    }
    public void actionPerformed(ActionEvent a){
        String first = FN.getText();
        String second = LN.getText();
        if (a.getSource() == btn){
            JOptionPane.showMessageDialog(null,"The person "+first+" "+second+" is registered");
            dispose();
        }
    }
    public static void main(String[] args){
        new SignUpScreen().setVisible(true);
    }
}
