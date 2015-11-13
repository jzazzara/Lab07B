import java.awt. *;
import java.applet. *;
public class Triangle
{
  	public static void drawTriangle(Graphics g)
	{
	  //Background
	  Expo.setColor(g,Expo.green);
	  Expo.fillRectangle(g,1000,0,2000,1000);
	  //Triangle
	  Expo.setColor(g,Expo.black);
	  Expo.drawLine(g,1500,300,1250,600);
	  Expo.drawLine(g,1500,300,1750,600);
	  Expo.drawLine(g,1250,600,1750,600);
    }
}
