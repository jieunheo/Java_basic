package ezen;

public class Example04
{
	public void errorTest(int x, int y) throws Exception
	{
		int n = 0;
		try
		{
			n = x / y;
			System.out.println(n);
		}catch(Exception e)
		{
			throw new Exception("나누기 오류");
		}
	}
	
	
	public static void main(String[] args)
	{
		Example04 e = new Example04();
		try {
			e.errorTest(1, 0);
		} catch (Exception ee) {
			//ee.printStackTrace();
		}
	}
}