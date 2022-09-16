package question3;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1= new DisplayEven();
		Thread t2=new OddNumber();
		t2.setName("Odd");
		t1.setName("Even");
		t1.start();
		t1.join();
		t2.start();
	}

}
