import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivTwoNums extends JFrame implements ActionListener {
    JTextField b1 = new JTextField();
    JTextField b2 = new JTextField();
    JLabel result = new JLabel("Result");
    JButton btn = new JButton("Divide");

    public DivTwoNums(){
        setTitle("Divide Two Numbers");
        setBounds(400,400,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        btn.addActionListener(this);

        b1.setBounds(100,0,100,20);
        b2.setBounds(100,50,100,20);
        btn.setBounds(100,100,100,20);
        result.setBounds(100,150,100,20);

        add(b1);
        add(b2);
        add(btn);
        add(result);
    }
    public void actionPerformed(ActionEvent e) {
        int f = Integer.parseInt(b1.getText());
        int s = Integer.parseInt(b2.getText());
        int r = f/s;
        if (e.getSource().equals(btn)){
            result.setText(String.valueOf(r));
        }
    }
    public static void main(String[] args){
        new DivTwoNums().setVisible(true);
    }
    }
