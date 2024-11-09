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
	JLabel lb1;
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