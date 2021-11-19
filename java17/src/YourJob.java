public class YourJob extends Thread
{
	@Override
	public void run() //Thread의 run() 재정의
	{
		System.out.println("Your job run!!");
		PrintJob();
	}
	
	public void PrintJob()
	{
		for (int i=0; i<10; i++)
		{
			System.out.println("your=" + i);
			try
			{
				Thread.sleep(400); //시간지연
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}