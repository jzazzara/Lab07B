import java.awt. *;
import java.applet. *;
public class Logo
{ 
public static void drawLogo(Graphics g)
	{
	   //Background
	   Expo.setColor(g,Expo.black);
	   Expo.fillRectangle(g,0,0,1000,1000);
	   //Top
	   Expo.setColor(g,Expo.white);
	   Expo.fillPolygon(g,500,245,530,280,480,400,425,400);
	   //Left
	   Expo.fillPolygon(g,530,320,600,475,550,475,505,375);
	   //Right
	   Expo.fillPolygon(g,400,415,500,415,525,460,375,460);
	
	   }
    }
