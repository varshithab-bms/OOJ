class MyThread implements Runnable{
	Thread t;
	String message;
	int interval;
	MyThread(String message,int interval)
	{
		this.message = message;
		this.interval = interval;
		t = new Thread(this,message);
		t.start();
	}
	
	public void run()
	{
		
		try{
		while(true){
		System.out.println(message);
		Thread.sleep(interval);
		}
		}catch(InterruptedException e){
			System.out.println("Thread interrupted..");
			}
		}
	}
class Q6{
	public static void main(String args[]){
		new MyThread("BMS College of Engineering",10000);
		new MyThread("CSE",2000);
		
			}
}