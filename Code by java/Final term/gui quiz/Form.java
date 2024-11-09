import javax.swing.*;
import java.lang.*;

public class Form extends JFrame{
	
	JPanel panel;
	JLabel name1 , name2 , name3 , name4;
	JTextArea txt1 , txt2;
	
	Form(){
		super("INput form ");
		this.setBounds(400,150,1050,750);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);

        
		name1 = new JLabel("Front Page ");
		name1.setBounds(480,25,80,15);
		panel.add(name1);

        
		name2 = new JLabel("Your name ");
        name2.setBounds(10,45,80,20);
		panel.add(name2);

        txt1 = new JTextArea();
		txt1.setBounds(95,45,100,20);
		panel.add(txt1);
		

	    name3 = new JLabel("Your Age ");
        name3.setBounds(10,75,80,20);
		panel.add(name3);

        txt2 = new JTextArea();
		txt2.setBounds(95,75,100,20);
		panel.add(txt2);
	   
		
		
		this.add(panel);
	}
	
}