//Create a frame in Swing
import java.awt.*;
import javax.swing.*;

class FrameDemoSwing
{
	public static void main(String args[])
	{
		//Create a frame
		JFrame fr = new JFrame("My Swing Program");
		//Set the size of frame
		fr.setSize(300,250);//300 px is the width and 250px for height
		//Display the frame
		fr.setVisible(true);
	}
}