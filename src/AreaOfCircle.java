import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaOfCircle extends JFrame implements ActionListener {
    JLabel res = new JLabel();
    JTextField radius = new JTextField();
    JButton calc = new JButton("CALCULATE");
    public AreaOfCircle(){
        setTitle("Calculate Area Of Triangle");
        setBounds(400,400,400,400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.addActionListener(this);

        res.setBounds(100,50,100,20);
        radius.setBounds(100,100,100,20);
        calc.setBounds(100,150,100,20);

        add(res);
        add(radius);
        add(calc);
    }
    public void actionPerformed(ActionEvent a){
        float rad = Float.parseFloat(radius.getText());
        String aoc = String.valueOf(22/7*rad*rad);
        if (a.getSource() ==calc)
            res.setText(aoc);
    }
    public static void main(String[] args){
        new AreaOfCircle().setVisible(true);
    }
}
