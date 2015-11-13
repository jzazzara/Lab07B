import java.awt. *;
import java.applet. *;
public class Eye
{
        public static void drawEye(Graphics g)
    {
      //Eye
      for (int x = 1; x <=1000; x++)
      {
      int red = Expo.random(0,255);
      int green = Expo.random(0,255);
      int blue = Expo.random(0,255);
      Expo.setColor(g,red,green,blue);
      Expo.fillOval(g,1500,475,100,50);
    }
      Expo.setColor(g,Expo.black);
      Expo.fillCircle(g,1500,475,25);
       
       }
    }
