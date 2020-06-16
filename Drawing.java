import java.awt.*;

public class Drawing {

	public static void main(String[] args) {

		DrawingPanel panel = new DrawingPanel(1080,640);
		Graphics2D g = panel.getGraphics();
		//g.setColor(Color.BLUE);
		//g.fillRect(17, 45, 139, 241);
		//g.drawOval(234, 77, 100, 100);
		//g.drawString("Hello World", 100, 100);
		g.drawLine(25, 75, 175, 25);
	}

}
