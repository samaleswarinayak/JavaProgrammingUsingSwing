//Create a frame in Swing
import java.awt.*;
import javax.swing.*;

class FrameDemoSwing1 extends JFrame
{
	public static void main(String args[])
	{
		//Create a frame
		FrameDemoSwing1 fr = new FrameDemoSwing1();
		//Set the title
		fr.setTitle("My Swing Program");
		//Set the size of frame
		fr.setSize(300,250);//300 px is the width and 250px for height
		//Display the frame
		fr.setVisible(true);
		//Close the window
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}