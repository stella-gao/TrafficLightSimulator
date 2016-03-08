
public class GoThread extends Thread{
	
public GoThread(String name) {
	super(name);
}

public void run() {
	DrawCircle c = new DrawCircle(3);
	c.setUpDrawer(c);
	StopThread s = new StopThread("Stop");
	AmberThread a = new AmberThread("Stop in ");
	for(int i = 7; i >= 0; i--) {
		
		System.out.println("Stop in " + i +" seconds");
		
		if(i == 3) {
			a.start();
		}else if(i == 0){
			//fill green
			s.start();
			this.stop();
		}
		
		try {							
			Thread.sleep(1800);						
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}//end For loop
}

	
	
	
	
}
