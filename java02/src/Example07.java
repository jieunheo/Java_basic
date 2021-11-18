public class Example07 
{
	public static void main(String[] args) 
	{
		int n = 5;
		
		if ( ( n % 2 ) == 0 ) 
		{
			System.out.println( n + "Àº(´Â) Â¦¼ö(if)" );
		} else 
		{
			System.out.println( n + "Àº(´Â) È¦¼ö(if)" );
		}
		
		switch ( n % 2 )
		{
			case 0:
				System.out.println( n + "Àº(´Â) Â¦¼ö(switch)" );
				break;
			case 1:
				System.out.println( n + "Àº(´Â) È¦¼ö(switch)" );
				break;
		}
	}
}