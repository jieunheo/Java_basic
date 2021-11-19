public class MyJob extends Thread
{
	@Override
	public void run() //Thread의 run() 재정의
	{
		System.out.println("my job run!!");
		PrintJob();
	}
	
	public void PrintJob()
	{
		for (int i=0; i<10; i++)
		{
			System.out.println("my=" + i);
			try
			{
				Thread.sleep(500); //시간지연
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}