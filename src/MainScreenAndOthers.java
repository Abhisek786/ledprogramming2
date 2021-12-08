

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreenAndOthers extends JFrame implements ActionListener {
    JButton login = new JButton("LogIn");
    JButton reg = new JButton("Register");
    JButton calc = new JButton("Calculate SI");

    public MainScreenAndOthers(){
        setTitle("Select One");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100,100,400,400);
        setLayout(null);
        login.addActionListener(this);
        reg.addActionListener(this);
        calc.addActionListener(this);

        login.setBounds(100,50,200,40);
        reg.setBounds(100,150,200,40);
        calc.setBounds(100,250,200,40);

        add(login);
        add(reg);
        add(calc);
    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource() == login) {
            new MainScreen.LogInScreenHidePW().setVisible(true);
            dispose();
        }
        if(a.getSource() == reg) {
            new SignUpScreen().setVisible(true);
            dispose();
        }
        if(a.getSource() == calc) {
            new MainScreen.CalculateSI().setVisible(true);
            dispose();
        }
    }
    public static void main(String[] args) {
        new MainScreenAndOthers().setVisible(true);
    }

    private class SignUpScreen {
        public void setVisible(boolean b) {
        }
    }
}
