import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaOfTriangle extends JFrame implements ActionListener {
    JTextField height = new JTextField();
    JTextField base = new JTextField();
    JButton calc = new JButton("Calculate");
    JLabel aof = new JLabel();
    JLabel heightl= new JLabel("enter the height");

    public AreaOfTriangle(){
        setTitle("Calculate Area Of Triangle");
        setBounds(400,400,400,400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.addActionListener(this);

        height.setBounds(100,50,100,20);
        base.setBounds(100,100,100,20);
        calc.setBounds(100,150,100,20);
        aof.setBounds(100,200,100,20);

        add(height);
        add(base);
        add(calc);
        add(aof);
    }
    public void actionPerformed(ActionEvent a){
        float h = Float.parseFloat(height.getText());
        float b = Float.parseFloat(base.getText());
        String AOF = String.valueOf(h*b/2);
        if (a.getSource()==calc){
            aof.setText(AOF);
        }
    }
    public static void main(String[] args){
        new AreaOfTriangle().setVisible(true);
    }
}
