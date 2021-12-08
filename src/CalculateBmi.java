import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateBmi extends JFrame implements ActionListener {
    JLabel Result = new JLabel("Result");
    JTextField b0 = new JTextField();
    JTextField b1 = new JTextField();
    JButton btn = new JButton("BMI");

    public CalculateBmi(){
        setTitle("Calculate BMI");
        setBounds(400,400,400,400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btn.addActionListener(this);

        Result.setBounds(100,50,100,20);
        b0.setBounds(100,100,100,20);
        b1.setBounds(100,150,100,20);
        btn.setBounds(100,200,100,20);

        add(Result);
        add(b0);
        add(b1);
        add(btn);
    }
    public void actionPerformed(ActionEvent e){
        float first = Float.parseFloat(b0.getText());
        float second = Float.parseFloat(b1.getText());
        float bmi = first/(second*second);
        if (e.getSource().equals(btn)){
            Result.setText(String.valueOf(bmi));
        }
    }
    public static void main(String[] args){
        new CalculateBmi().setVisible(true);
    }
}
