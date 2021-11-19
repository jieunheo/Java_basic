public class ThreadTest
{
	/* Thread 예제 */
	public static void main(String[] args)
	{
		MyJob myjob = new MyJob();
		YourJob yourjob = new YourJob();
		
		myjob.setName("MyJob");
		yourjob.setName("YourJob");
		
		myjob.start();
		yourjob.start();
		
		System.out.println("main is done..");
	}
}

//같은 Thread를 두개 동작시 -> IllegalThreadStateException

//run()   -> 차례대로 실행
//start() -> 자동으로 run() 실행
//           Thread로 동작
//setName("이름") -> 쓰레드의 구분이름 적용 