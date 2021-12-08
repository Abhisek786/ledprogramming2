package MainScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateSI extends JFrame implements ActionListener {
    JTextField principle = new JTextField();
    JTextField time = new JTextField();
    JTextField rate = new JTextField();
    JButton btn = new JButton("Calculate");
    JLabel pl = new JLabel("Enter Principle:- ");
    JLabel tl = new JLabel("Enter Time:- ");
    JLabel rl = new JLabel("Enter Rate:- ");


    public CalculateSI(){
        setTitle("Calculate Simple Interest");
        setBounds(400,400,400,400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btn.addActionListener(this);

        principle.setBounds(100, 50,100,20);
        pl.setBounds(0, 50,100,20);
        tl.setBounds(0, 100,100,20);
        rl.setBounds(0, 150,100,20);
        time.setBounds(100, 100,100,20);
        rate.setBounds(100, 150,100,20);
        btn.setBounds(100, 200,100,20);

        add(principle);
        add(pl);
        add(rl);
        add(tl);
        add(time);
        add(rate);
        add(btn);
    }
    public void actionPerformed(ActionEvent e){
        float p = Float.parseFloat(principle.getText());
        float t = Float.parseFloat(time.getText());
        float r = Float.parseFloat(rate.getText());
        String si = String.valueOf(p*t*r/100);
        if (e.getSource().equals(btn)){
            JOptionPane.showMessageDialog(null,"Simple Interest:- "+si);
            dispose();
        }
    }
    public static void main(String[] args){
        new CalculateSI().setVisible(true);
    }
}
