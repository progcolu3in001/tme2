package tme2;
import java.awt.Point;
import graphic.Window;

public class DessineLigne implements Runnable {
	
	private int x1,y1, x2,y2;
	private Window w;
	
	public DessineLigne(int ax, int ay, int bx, int by, Window wi){
		x1 = ax; 
		x2 = bx; 
		y1 = ay; 
		y2 = by;
		w = wi;
	}
	
	public void run() {
		w.drawLine(new Point(x1, y1) ,new Point(x2, y2) );
	}
}
