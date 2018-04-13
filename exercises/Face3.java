// Whitaker Brand
// Section AB
// TA: Suraj
//
// This class draws a simple block-shaped figure with a red hat.
// The method to draw the person is parameterized to take in
// the x and y offset, but we'd also like to add a scaling
// factor, so that we can make the person larger or smaller.
import java.awt.*;

public class Drawing {
   public static void main(String[] args) {
      // Not great style to declare variables that you only use once:
      // So, pass the values directly to make the panel
      //int width = 2000;
      //int height = 1500;
      DrawingPanel panel = new DrawingPanel(2000, 1500);
      Graphics pen = panel.getGraphics();
      trumpStamp(pen, 0, 0);
      for (int i = 1; i <= 10; i++) {
         for (int j = 1; j <= 10; j++) {
            trumpStamp(pen, i * 300, j * 400);         
         }
      }
   }

   // draws a cartoonish image of a person with a MAGA hat
   // accepts a Graphics object with which to draw, and an
   // x and y offset, indicating the top-left corner of the
   // figure
   public static void trumpStamp(Graphics pen, int xOffset, int yOffset) {      
      // draw suit
      pen.setColor(Color.BLACK);
      pen.fillRect(xOffset + 0, yOffset + 200, 300, 600);
      
      // draw shirt
      pen.setColor(Color.WHITE);
      pen.fillRect(xOffset + 110, yOffset + 200, 80, 300);
      
      // draw tie
      pen.setColor(Color.BLUE);
      pen.fillRect(xOffset + 140, yOffset + 200, 20, 250);
      
      // draw head
      Color beige = new Color(240, 190, 80); 
      pen.setColor(beige);
      pen.fillOval(xOffset + 30, yOffset + 30, 240, 240);
      
      // draw hat
      pen.setColor(Color.RED);
      pen.fillOval(xOffset + 30, yOffset + 10, 240, 120);
      pen.fillRect(xOffset + 30, yOffset + 70, 240, 40);
      
      // draw hair
      Color yellow = new Color(245, 235, 140);
      pen.setColor(yellow);
      pen.fillOval(xOffset + 20, yOffset + 90, 250, 40);

      // draw text      
      pen.setColor(Color.WHITE);
      pen.setFont(new Font("Times New Roman", Font.PLAIN, 48));
      pen.drawString("MAGA", xOffset + 80, yOffset + 70);
   }
}
