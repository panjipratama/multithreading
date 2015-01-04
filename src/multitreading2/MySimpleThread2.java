package multitreading2;

class myThread2 extends Thread {
	private int countDown = 5;
	private static int threadCount = 0;
	private int threadNumber = ++threadCount;
	
	public myThread2()
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

public class MySimpleThread2 
{
	public static void main (String [] args)
	{
		for (int i = 0 ; i < 5;i++)
		{
			new myThread2().start();
			//untuk melakukan sleep (seperti delay)
			//termasuk dalam pengontrolan thread
			try 
			{
				Thread.sleep(1000);
			} catch(InterruptedException e)
			{
				System.out.println("error : "+ e );
			}
		}
		System.out.println("Semua  threads telah selesai dibuat dan dijalankan !");
		
	}
}