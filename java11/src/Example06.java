public class Example06 
{
	public static void main(String[] args) 
	{
		String str = "10,000";
		
		if( Utility.IsNumber(str) == true)
		{
			System.out.println("숫자:" + Utility.ToNumber(str));
		}	
		
		String score1 = "10, 99, 40, 90, 88, 100";
		int sum = Utility.MakeSum(score1);
		System.out.println("합계:" + sum);
	}
}
