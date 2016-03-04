import java.lang.*;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawCircle extends Frame{
	Color color;
	
	public DrawCircle(Color c){
		color = c;
	}
	
  public void paint(Graphics g) {
	  
	  fillRed(g);
	  drawOrange(g);
	  drawGreen(g);

  }
  
  public void fillRed(Graphics g){
	  Graphics2D ga = (Graphics2D)g;
	     ga.setPaint(Color.RED);
	     ga.fillOval(150,150,100,100);
  }
  
  public void drawRed(Graphics g){
	  Graphics2D ga = (Graphics2D)g;
	     ga.setPaint(Color.RED);
	     ga.drawOval(150,150,100,100);
  }
              
  
  public void fillOrange(Graphics g){
	  Graphics2D ga2 = (Graphics2D)g;
	     ga2.setPaint(Color.ORANGE);
	     ga2.fillOval(150,300,100,100);
  }
  
  public void drawOrange(Graphics g){
	  Graphics2D ga2 = (Graphics2D)g;
	     ga2.setPaint(Color.ORANGE);
	     ga2.drawOval(150,300,100,100);
  }
  
  
  public void drawGreen(Graphics g){
	  Graphics2D ga2 = (Graphics2D)g;
	     ga2.setPaint(Color.GREEN);
	     ga2.drawOval(150,450,100,100);
  }
  
  public void fillGreen(Graphics g){
	  Graphics2D ga2 = (Graphics2D)g;
	     ga2.setPaint(Color.GREEN);
	     ga2.fillOval(150,450,100,100);
  }
  
  
  
  
  public static void main(String args[]) 
  {

      DrawCircle circle1 = new DrawCircle(Color.GREEN);   
//      DrawCircle frame2 = new DrawCircle(Color.GREEN);   
      
      circle1.addWindowListener(
    	  new WindowAdapter() {
	         public void windowClosing(WindowEvent we)
	         {
	            System.exit(0);
	         }
    	  }
	  );
      
           
      circle1.setSize(400, 400);
      
      
      circle1.setVisible(true);
      
   }
}