public class Example04 
{
	public static void main(String[] args) 
	{
		int x = 1;
		int y = 1;
		
		while ( x <= 9 )
		{
			y = 1;
			while ( y <= 9 )
			{
				System.out.print( "*" );
				y++; 
			}
			System.out.print( "\n" ); //println( "" );
			x++;
		}
	}
}