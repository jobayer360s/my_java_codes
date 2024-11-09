//step 0
import javax.swing.*;
import java.lang.*;
//step 1
public class FrameSample extends JFrame 
{
	//step 2
	JPanel panel;
	JLabel name1, name2;
	JTextField txt1;
	
	//step 4
	public FrameSample()
	{
		
		//step 4(a)
		super("My FIRST GUI"); //header of frame
		//this.setSize(800,400); //(width, height)
		this.setBounds(800,300,500,500); //(x,y,width,height)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//step 4(b)
		panel = new JPanel();
		panel.setLayout(null);
		
		//step 4(d)
		name1 = new JLabel("Welcome to OOP1[I] GUI class");
		name1.setBounds(150,20,200,50);
		panel.add(name1);
		
		name2 = new JLabel("Your Name");
		name2.setBounds(30,50,100,50);
		panel.add(name2);
		
		txt1 = new JTextField();
		txt1.setBounds(100,65,100,20);
		panel.add(txt1);
		
		//step 4(f)
		this.add(panel);
	}
}
