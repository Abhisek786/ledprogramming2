
import javax.swing.*;
import java.awt.*;

class HelloWorld extends JFrame {
    JLabel lH;
    JLabel RK;
    public HelloWorld() {
        setTitle("Hello World");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(450, 200, 650, 450);
        setResizable(true);

        // for welcome
        lH = new JLabel("Hello World");
        RK = new JLabel("I Am RK");
        lH.setForeground(Color.red);
        RK.setForeground(Color.green);
        lH.setFont(new Font("Cambria", Font.BOLD,10));
        RK.setFont(new Font("Times", Font.BOLD,15));
        lH.setBounds(100, 100, 100, 100);
        RK.setBounds(15, 15, 110, 25);
        add(lH);
        add(RK);
    }
    public static void main(String[] args){
        new HelloWorld().setVisible(true);
    }
}
// main window-- 3 btns(login, register, clalculate si)
// login-- new LogInScreenHidePw-- result in popup
// Register-- new SignUpScreen-- result in popup
// CalculateSI -- new CalculateSI-- result in popup