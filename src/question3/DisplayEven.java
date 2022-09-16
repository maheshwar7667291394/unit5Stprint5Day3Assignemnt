package question3;

public class DisplayEven extends Thread{
	
	@Override 
	public void run() {
		for(int i=0;i<20;i++) {
			
			if(i%2==0) {
				String name=Thread.currentThread().getName();
				System.out.println(i+" : "+name);
			}
		}
	}

}
