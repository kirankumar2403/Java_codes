import javax.swing.*;  
import java.awt.event.*;  

public class JFrameEx extends JFrame implements ActionListener {  
    JButton b;  
    JTextField tf;  

    public JFrameEx() {  
        setTitle("JFrame Example");  
        setSize(400, 300);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        tf = new JTextField();  
        tf.setBounds(30, 40, 150, 20);  

        b = new JButton("Click");  
        b.setBounds(80, 150, 70, 40);  
        b.addActionListener(this);  

        add(tf);  
        add(b);  
        setVisible(true);  
    }  

    public void actionPerformed(ActionEvent e) {  
        tf.setText("Welcome");  
    }  

    public static void main(String[] args) {  
        new JFrameEx();  
    }  
}
