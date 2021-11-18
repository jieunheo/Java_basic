public class Example02
{
	//try-catch 연습2, 예외처리
	public static void main(String[] args)
	{
		String  d1 = "35";
		int 	n1 = 0;
		String  d2 = "12.34";
		double 	n2 = 0;
		
		try
		{
			n1 = Integer.parseInt(d1);
			System.out.println(n1);
			
			n2 = Double.parseDouble(d2);
			System.out.println(n2);
			
			int x = 10;
			int y = 0;
			int z = 0;
			z = x / y;
		} catch (Exception e)
		{
			//e.printStackTrace();
			String s = e.getMessage();
			System.out.println("ERR: "+s);
		}
		
		System.out.println("정상 종료");
	}
}