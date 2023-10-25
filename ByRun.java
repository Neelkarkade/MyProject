package multithreading;

public class ByRun implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("I am ByRun");
		}

	}
	public static void main(String[] args) {
		ByRun br=new ByRun();
		Thread t=new Thread(br);
		
		ThreadbyTh th=new ThreadbyTh();
		th.start();
		t.start();
	
	}

}
