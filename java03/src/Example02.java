public class Example02 
{
	public static void main(String[] args) 
	{
		int n = 1;
		int oddSum = 0;
		int evenSum = 0;
		
		while ( n <= 10 )
		{
			System.out.println( "n�� ��: " + n );
			
			if ( ( n % 2 ) == 0 )
			{
				evenSum = evenSum + n;
			} else
			{
				oddSum = oddSum + n;
			}
			n = n + 1;
		}
		System.out.println( "¦���� �հ�� " + evenSum + ", Ȧ���� �հ�� " + oddSum + " �Դϴ�." );
	}
}