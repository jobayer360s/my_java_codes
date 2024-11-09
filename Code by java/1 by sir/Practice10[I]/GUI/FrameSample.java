//step 0
import javax.swing.*;
import java.lang.*;
//step 1
public class FrameSample extends JFrame 
{
	//step 2
	JLabel name;
	
	//step 4
	public FrameSample()
	{
		//step 4(a)
		super("My FIRST GUI"); //header of frame
		//this.setSize(800,400); //(width, height)
		this.setBounds(750,200,720,720); //(x,y,width,height)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
