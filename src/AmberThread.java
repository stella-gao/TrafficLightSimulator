import java.lang.*;

public class AmberThread extends Thread {
	String text;
	public AmberThread(String name) {
		text = name;
	}
	
	
	public void run() {
		StringBuffer s = new StringBuffer("Go in ");
		if(text.contentEquals(s)){	//if the running thread is stop
			System.out.println(text);
			DrawCircle c = new DrawCircle(2);
			c.setUpDrawer(c);
		}else{
			DrawCircle c = new DrawCircle(4);
			c.setUpDrawer(c);
		}
		
		
		for(int i = 3; i >= 0; i--) {
			
			System.err.println(text + " " + i +" seconds");
			
			if(i == 0){
				
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
