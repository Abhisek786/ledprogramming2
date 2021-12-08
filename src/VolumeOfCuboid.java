import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VolumeOfCuboid extends JFrame implements ActionListener {
    JLabel result = new JLabel();
    JTextField length = new JTextField();
    JTextField breadth = new JTextField();
    JTextField height = new JTextField();
    JButton calc = new JButton("Calculate");
    JLabel lengthl=new JLabel("enter the length");
    JLabel breadthl=new JLabel("enter the breadth");
    JLabel heightl=new JLabel("enter the height");

    public VolumeOfCuboid(){
        setTitle("Calculate Volume Of Cuboid");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,400,400,400);
        calc.addActionListener(this);

        result.setBounds(100,50,100,20);
        length.setBounds(100,100,100,20);
        breadth.setBounds(100,150,100,20);
        height.setBounds(100,200,100,20);
        calc.setBounds(100,250,100,20);
        lengthl.setBounds(0,100,100,20);
        breadthl.setBounds(0,150,100,20);
        heightl.setBounds(0,200,100,20);
        calc.setBounds(100,150,100,20);

        add(result);
        add(length);
        add(breadth);
        add(height);
        add(calc);
        add(lengthl);
        add(breadthl);
        add(heightl);

    }
    public void actionPerformed(ActionEvent a){
        float l = Float.parseFloat(length.getText());
        float b = Float.parseFloat(breadth.getText());
        float h = Float.parseFloat(height.getText());
        String voc = String.valueOf(l*b*h);
        if (a.getSource()==calc)
            result.setText(voc);
    }
    public static void main(String[] args) {
        new VolumeOfCuboid().setVisible(true);
    }
}
