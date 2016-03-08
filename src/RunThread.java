import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RunThread {
	public static void main(String[] args)
	{
		StopThread st = new StopThread("Stop Counter");	
		st.start();
	}
	
}

