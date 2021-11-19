public class MyJob implements Runnable
{
	@Override
	public void run()
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