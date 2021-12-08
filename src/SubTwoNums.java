import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubTwoNums extends JFrame implements ActionListener {
    JLabel result = new JLabel("Result:- ");
    JTextField box0 = new JTextField();
    JTextField box1 = new JTextField();
    JButton sub = new JButton("SUB");

    public SubTwoNums(){
        setTitle("Subtract Two Numbers");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(700, 700, 500,500);
        setLayout(null);
        sub.addActionListener(this);

        box0.setBounds(100,100,100,19);
        box1.setBounds(100,150,100,19);
        sub.setBounds(100,200,100,19);
        result.setBounds(100,250,100,19);

        add(result);
        add(box0);
        add(box1);
        add(sub);
    }
    public void actionPerformed(ActionEvent e){
        int f = Integer.parseInt(box0.getText());
        int s = Integer.parseInt(box1.getText());
        int subt = 0;
        if (e.getSource().equals(sub)){
            subt = f-s;
            box0.setText(String.valueOf(subt));
        }
    }
    public static void main(String[] args){
        new SubTwoNums().setVisible(true);
    }
}
