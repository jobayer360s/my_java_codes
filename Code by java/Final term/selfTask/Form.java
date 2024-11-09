import javax.swing.*;
import java.lang.*;
import java.util.*;

public class Form extends JFrame{
	
	JPanel pn1;
	JLabel lb1 , lb2 , lb3 , lb4 , lb5;
	JTextField txt1 , txt2;
	ImageIcon image1 , image2;
	JButton button1;
	Form(){
		super("Input Form ");
		this.setBounds(550,350,850,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		pn1 = new JPanel();
		pn1.setLayout(null);
		
		lb1 = new JLabel("Input Form *");
		lb1.setBounds(350,10,100,80);
		pn1.add(lb1);
		
		lb2 = new JLabel("Your name *");
		lb2.setBounds(10,55,100,50);
		pn1.add(lb2);
		
		txt1 = new JTextField();
		txt1.setBounds(120,62,100,30);
		pn1.add(txt1);
		
		lb3 = new JLabel("Your Family name *");
		lb3.setBounds(10,95,200,50);
		pn1.add(lb3);
		
		txt2 = new JTextField();
		txt2.setBounds(120,99,100,30);
		pn1.add(txt2);
		
		image1 = new ImageIcon("walton.jpg");
		lb4 = new JLabel(image1);
		lb4.setBounds(400,75,320,250);
		pn1.add(lb4);
		
		image2 = new ImageIcon("marcel.jpg");
		JLabel lb5 = new JLabel(image2);
		lb5.setBounds(400,350,350,50);
		pn1.add(lb5);
		
		ImageIcon image3 = new ImageIcon("loginIcon.png");
		button1 = new JButton(image3);
		button1.setBounds(35,145,50,50);
		pn1.add(button1);
		
		this.add(pn1);
		
	}
	
}