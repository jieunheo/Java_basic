public class Example01 
{
	public static void main(String[] args) 
	{
		//0���� 10���� �հ踦 ���ϴ� ���α׷�
		int n = 0;
		int sum = 0;
		
		while ( n <= 10 )
		{
			System.out.println( "this is n: " + n );
			sum = sum + n;
			n = n + 1;
		}
		System.out.println( "sum: " + sum );
	}
}