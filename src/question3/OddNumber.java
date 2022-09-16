package question3;

public class OddNumber extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			if(i%2==1) {
				String name=Thread.currentThread().getName();
				System.out.println(i+" :"+name);
			}
		}
	}

}
