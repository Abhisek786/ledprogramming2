

        import javax.swing.*;
        import java.awt.*;
public class loginScreen extends JFrame {
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
    public loginScreen() {
        // Setting up the window to work on
        setTitle("Sign Up");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(600, 600, 300,300);
        // Inside the window
        // Labels
        fn.setBounds(0,110, 100, 100);
        ln.setBounds(0, 140, 100, 100);
        em.setBounds(0, 170, 100, 100);
        ge.setBounds(0, 200, 100, 100);
        DOB.setBounds(0, 230, 100, 100);
        pw.setBounds(0, 260, 100, 100);
        cpw.setBounds(0, 70, 150, 100);
// Text boxes
        FN.setBounds(120, 160, 150, 20);
        LN.setBounds(120, 190, 150, 20);
        EM.setBounds(120, 220, 150, 20);
        GE.setBounds(120, 250, 150, 20);
        dob.setBounds(120, 280, 150, 20);
        PW.setBounds(120, 310, 150, 20);
        CPW.setBounds(120, 340, 150, 20);


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
    public static void main(String[] args){
        new loginScreen().setVisible(true);
    }
}


