public class Example07 
{
	public static void main(String[] args) 
	{
		int n = 5;
		
		if ( ( n % 2 ) == 0 ) 
		{
			System.out.println( n + "��(��) ¦��(if)" );
		} else 
		{
			System.out.println( n + "��(��) Ȧ��(if)" );
		}
		
		switch ( n % 2 )
		{
			case 0:
				System.out.println( n + "��(��) ¦��(switch)" );
				break;
			case 1:
				System.out.println( n + "��(��) Ȧ��(switch)" );
				break;
		}
	}
}