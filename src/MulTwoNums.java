import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MulTwoNums extends JFrame implements ActionListener {
    JTextField box0 = new JTextField();
    JTextField box1 = new JTextField();
    JLabel result = new JLabel("Result:- ");
    JButton btn = new JButton("Multiply");

    public MulTwoNums(){
        setTitle("Multiply Two Numbers");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,400,400,400);
        setLayout(null);
        btn.addActionListener(this);

        box0.setBounds(100, 100, 100, 20);
        box1.setBounds(100, 150, 100, 20);
        result.setBounds(100, 200, 100,20);
        btn.setBounds(100, 250, 100, 20);

        add(box0);
        add(box1);
        add(result);
        add(btn);
    }
    public void actionPerformed(ActionEvent e){
        int f = Integer.parseInt(box0.getText());
        int s = Integer.parseInt(box1.getText());
        int m = 0;
        if (e.getSource().equals(btn)){
            m = f*s;
            result.setText(String.valueOf(m));
        }
    }
    public static void main(String[] args){
        new MulTwoNums().setVisible(true);
    }
}