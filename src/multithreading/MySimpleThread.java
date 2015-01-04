package multithreading;

class MyThread implements Runnable {
	private int countDown = 5;
	private static int threadCount = 0;
	private int threadNumber = ++threadCount;
	
	public MyThread()
	{
		System.out.println("pembuatan Thread ke "+threadNumber);
	}
	
	public void run ()
	{
		while (true)
		{
			System.out.println("Thread "+threadNumber+"CountDown "+countDown);
			if (--countDown == 0) return;
		}
	}
}

public class MySimpleThread 
{
	public static void main (String [] args)
	{
		for (int i = 0 ; i < 5;i++)
		{
			MyThread o = new MyThread();
			Thread oTh = new Thread(o);
			oTh.start();
		}
		
		System.out.println("Semua  thread telah selesai dibuat !");
	}
}