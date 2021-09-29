package tme2;

import graphic.Window;
import java.awt.Point;

public class Main {
	public static void main(String[] args) {
		Window w = new Window(600, 400, "test");
		Point a = new Point(5,10);
		Point b = new Point(50,200);
		Point c = new Point(500,300);
		w.drawLine(a, b);
		w.drawLine(b, c);
		w.drawLine(a, c);
	}
}
