package tme2;

import graphic.Window;
import java.awt.Point;

public class Main {
	public static void main(String[] args) {
		Window w = new Window(600, 400, "test");
		new DessineLigne(5, 10, 50, 200, w).start();
		new DessineLigne(50, 200, 500, 300, w).start();
		new DessineLigne(5, 10, 500, 300, w).start();
	}
}
