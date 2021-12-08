import javax.swing.*;

public class Addtwonums extends JFrame {
    JLabel fn=new JLabel("sum");

    JTextField one = new JTextField();
    JTextField two = new JTextField();
    JButton btn = new JButton("ADD");
    public Addtwonums(){
        setTitle("Add Two Numbers");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(700,700,100,100);
        setLayout(null);
        one.setBounds(100, 0,100,20);
        two.setBounds(100, 30,100,20);
        btn.setBounds(100, 90,100,20);
        fn.setBounds(250,90,100,20);
        add(one);
        add(two);
        add(btn);
        add(fn);
    }
    public static void main(String[] args){
        new Addtwonums().setVisible(true);
    }
}