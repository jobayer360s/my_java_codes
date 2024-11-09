import javax.swing.*;
import java.lang.*;
import java.util.*;

public class Xframe extends JFrame{
	JLabel name;
	
	public Xframe(){
		super("J Family Ltd. ");
		this.setBounds(400,300,800,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}