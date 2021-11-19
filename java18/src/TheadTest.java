public class TheadTest
{
	/* Thread - implements Runnable 연습 */
	public static void main(String[] args)
	{
		//MyJob my = new MyJob();
		//my.run();
		
		/* //runnable을 thread로 실행
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