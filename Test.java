//Swing program to design frame for addition

import java.awt.*;
import javax.swing.*;

class Test 
{
	JButton b1;
	JTextField t1,t2;
	JLabel lb1,lb2,lb3;
	JFrame f;
	Test()
	{
		f = new JFrame("Addition of two numbers");
		lb1 = new JLabel("Enter First Number");
		lb1.setBounds(5,50,150,30);
		f.add(lb1);
		
		t1 = new JTextField();
		t1.setBounds(200,50,150,30);
		f.add(t1);
		
		lb2 = new JLabel("Enter Second Number");
		lb2.setBounds(5,80,150,30);
		f.add(lb2);
		
		t2 = new JTextField();
		t2.setBounds(200,80,150,30);
		f.add(t2);
		
		lb3 = new JLabel("Result");
		lb3.setBounds(90,140,150,30);
		f.add(lb3);
		
		b1 = new JButton("+");
		b1.setBounds(90,200,100,30);
		f.add(b1);
		
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		Test ob = new Test();
	}
}