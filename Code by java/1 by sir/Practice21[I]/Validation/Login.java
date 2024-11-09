import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
	JLabel label;
	JButton backBtn;
	JPanel panel;
	
	public Login(String s1,String s2)
	{
		super("LogIN");
		this.setBounds(280,115,800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		label=new JLabel("Text"+" "+s1+" "+s2);
		label.setBounds(50,50,300,30);
		panel.add(label);
		
		backBtn=new JButton("Back");
		backBtn.setBounds(150,150,80,30);
		backBtn.addActionListener(this);
		panel.add(backBtn);

		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == backBtn)
		{
			Newframe obj2=new Newframe();
			obj2.setVisible(true);
			this.setVisible(false);
		}
	}
}