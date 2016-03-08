import java.awt.Color;
import java.io.Console;

public class StopThread extends Thread {
	
	StopThread(String name)
	{
		super(name);
	}
	
	
	public void run() {
		int stopCount;
		DrawCircle c = new DrawCircle(1);
		c.setUpDrawer(c);
		
		GoThread g = new GoThread("Go");
		AmberThread a = new AmberThread("Go in ");
		
		for(stopCount = 7; stopCount >= 0; stopCount--)
		{
			
			if (stopCount == 3) {
				a.start();
			}else if(stopCount == 0){
				g.start();
				this.stop();
			}
			
				try {
					System.out.println("Go in  "+stopCount+" seconds");
					
					Thread.sleep(1800);
					
				}catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			
		}
		
	}
	
	
 
}

