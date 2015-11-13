// Lab07Bst.java
// The OOP Graphics Program
// This is the student, starting file for Lab 07B.
// This is an "Open-Ended" asignment.


import java.awt.*;
import java.applet.*;
public class Lab07Bst extends Applet
{
	public void paint(Graphics g)
	{
	   //Abstergo Logo
	   Logo.drawLogo(g);
	   //Illuminati
	   Triangle.drawTriangle(g);
	   Eye.drawEye(g);
	   }
}