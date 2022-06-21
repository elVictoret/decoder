import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui {
		
	public void environment() {  
    JFrame f=new JFrame("Decoder by Victoret");  
    
    final JTextField tf=new JTextField();  
    tf.setBounds(50,50,300,20);  
    
    final JTextField tf2=new JTextField();  
    tf2.setBounds(50,250,300,20);  
    
    JLabel label1 = new JLabel("Encoded text");
    label1.setBounds(50,30,300,20);
    JLabel label2 = new JLabel("Decoded text");
    label2.setBounds(50,230,300,20);
    
    JButton button1=new JButton("base32");
    JButton button2=new JButton("base64");
    JButton button3=new JButton("rot13");
    JButton button4=new JButton("Caesar cipher");
    
    button1.setBounds(50,100,100,30);  
    button1.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
	            tf.setText("base32");  
				}  
	    	});  
	    
    button2.setBounds(50,150,100,30);  
    button2.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
	            tf.setText("base64");  
				}  
	    	});  
	    
    button3.setBounds(250,100,100,30);  
    button3.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
	            tf.setText("rot13");  
				}  
	    	});  
	 
    button4.setBounds(250,150,100,30);  
    button4.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
	            tf.setText("Caesar cipher");
				} 
	    	});  
    
    
    f.add(button1);
    f.add(button2);
    f.add(button3);
    f.add(button4);
    f.add(tf);
    f.add(tf2);
    f.add(label1);
    f.add(label2);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   

	}
}
