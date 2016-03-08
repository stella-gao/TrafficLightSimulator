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
import javax.swing.JTextField;

public class DrawCircle extends JFrame{
	int id;
	
	public DrawCircle(int category) {
		id = category;
	}
	
  public void paint(Graphics g) {
	  switch (id) {
		case 1:
			
			fillRed(g);
			drawOrange(g);
			drawGreen(g);
			break;
		case 2:
			fillRed(g);
			fillOrange(g);
			drawGreen(g);
			break;
		case 3:
			drawRed(g);
			drawOrange(g);
			fillGreen(g);
			break;
		case 4:
			drawRed(g);
			fillOrange(g);
			fillGreen(g);
			break;
		
		default:
			break;
	  }

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
  
  public void repaint() {
	super.repaint();
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
  
  
  
  public void setUpDrawer(DrawCircle c){
    c.addWindowListener( new WindowAdapter() {
         public void windowClosing(WindowEvent we) {
            System.exit(0);
         }
  	  });
            
    c.setSize(400, 900);
    
    c.setVisible(true);
  }
  
  
  
}