//step 0
import javax.swing.*;
import java.lang.*;
import java.awt.*; //this package is used for coloring/font changing..
import java.awt.event.*; //used for interface
//step 1
//There are two interface for Frame desingn (MouseListener, ActionListener)s
public class NextFrame extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8;
	JButton jb1, jb2;
	public NextFrame()
	{
		//step 4(a)
		super("My Second GUI"); //header of frame
		//this.setSize(800,400); //(width, height)
		this.setBounds(700,200,800,700); //(x,y,width,height)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//step 4(b)
		panel = new JPanel();
		panel.setLayout(null);
		
		lb1 = new JLabel("Hello 2nd frame");
		lb1.setBounds(30,50,100,50);
		panel.add(lb1);
		
		jb1 = new JButton("Back");
		jb1.setBounds(100,500,100,40);
		jb1.setBackground(Color.ORANGE);
		jb1.setForeground(Color.RED);
		jb1.addActionListener(this);
		panel.add(jb1);
		
		jb2 = new JButton("Exit");
		jb2.setBounds(100,530,100,40);
		jb2.setBackground(Color.ORANGE);
		jb2.setForeground(Color.RED);
		jb2.addActionListener(this);
		panel.add(jb2);
		
		this.add(panel);
	}
	
	public NextFrame(String s1, String s2, String s3, String s4,
	                 String s5, String s6, String s7)
	{
		//step 4(a)
		super("My Second GUI"); //header of frame
		//this.setSize(800,400); //(width, height)
		this.setBounds(700,200,800,700); //(x,y,width,height)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//step 4(b)
		panel = new JPanel();
		panel.setLayout(null);
		
		lb1 = new JLabel("Hello 2nd frame");
		lb1.setBounds(30,50,300,50);
		panel.add(lb1);
		
		lb2 = new JLabel("Name: "+s1);
		lb2.setBounds(30,80,300,50);
		panel.add(lb2);
		
		lb3 = new JLabel("ID: "+s2);
		lb3.setBounds(30,110,300,50);
		panel.add(lb3);
		
		lb4 = new JLabel("NID: "+s3);
		lb4.setBounds(30,140,300,50);
		panel.add(lb4);
		
		lb5 = new JLabel("Gender: "+s4);
		lb5.setBounds(30,170,300,50);
		panel.add(lb5);
		
		lb6 = new JLabel("Course: "+s5);
		lb6.setBounds(30,200,300,50);
		panel.add(lb6);
		
		lb7 = new JLabel("Semester: "+s6);
		lb7.setBounds(30,230,300,50);
		panel.add(lb7);
		
		lb8 = new JLabel("OOP: "+s7);
		lb8.setBounds(30,260,300,50);
		panel.add(lb8);
		
		jb1 = new JButton("Back");
		jb1.setBounds(100,500,100,40);
		jb1.setBackground(Color.ORANGE);
		jb1.setForeground(Color.RED);
		jb1.addActionListener(this);
		panel.add(jb1);
		
		jb2 = new JButton("Exit");
		jb2.setBounds(100,530,100,40);
		jb2.setBackground(Color.ORANGE);
		jb2.setForeground(Color.RED);
		jb2.addActionListener(this);
		panel.add(jb2);
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == jb1) //Back button
		{
			FrameSample obj3 = new FrameSample();
			obj3.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == jb2) //Exit button
		{
			System.exit(0);
		}
	}
}