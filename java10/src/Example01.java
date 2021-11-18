public class Example01 
{
	//try-catch 연습1, 예외처리
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 0;
		int z = 0;
		
		try
		{
			z = x / y;
			System.out.println("step1");
		} catch (Exception e)
		{
			System.out.println("step2");
		} finally //
		{
			System.out.println("step4");
		}
		
		System.out.println("step3");
		System.out.println(z);
	}
}