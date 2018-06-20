import java.awt.*;
import java.awt.event.*;

class draw extends Frame implements MouseMotionListener
{
  Frame f;
  Panel p;
  Label l1,l2;
  TextField t1,t2;
  int x,y,h,w;
    
	 public draw()
	   {
	     f=new Frame();
		 f.setSize(400,400);
		 f.addMouseMotionListener(this);
		 p=new Panel();
		 
		 f.setVisible(true);
	   }
	   
	  public void mouseMoved(MouseEvent e)
	  {
		  x=e.getX();
		  y=e.getY();
		  w=f.getWidth();
		  h=f.getHeight();
		 
		   Graphics g =f.getGraphics();
	        
	         	 g.setColor(Color.red);
		         g.drawLine(0,0,x,y);
		         g.setColor(Color.green);
		         g.drawLine(0,h,x,y);
		         g.setColor(Color.blue);
		         g.drawLine(w,0,x,y);
		         g.setColor(Color.yellow);
		         g.drawLine(w,h,x,y);
	 
		  
	  }
	  public void mouseDragged(MouseEvent e1)
	  {}
      	  
    
   public static void main(String args[])
   {
     draw d=new draw();
   }
}   