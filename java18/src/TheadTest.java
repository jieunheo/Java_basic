public class TheadTest
{
	/* Thread - implements Runnable ���� */
	public static void main(String[] args)
	{
		//MyJob my = new MyJob();
		//my.run();
		
		/* //runnable�� thread�� ����
		Runnable my = new MyJob();
		Thread t = new Thread(my);
		t.start();
		*/
		/*
		Thread t = new Thread(new MyJob());
		t.start();
		*/
		
		new Thread(new MyJob()).start();
		new Thread(new MyJob()).start();
		new Thread(new MyJob()).start();
		
		System.out.println("main is done..");
	}
}