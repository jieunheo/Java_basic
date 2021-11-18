public class Example03 
{
	public static void main(String[] args) 
	{
		//구구단 출력 프로그램
		int x = 1;
		int y = 1;
		
		while ( x <= 9 )
		{
			//System.out.println( "x = " + x );
			System.out.println( "----" + x + "단 ----" );
			
			y = 1;
			while ( y <= 9 )
			{
				//int s = x * y;
				//System.out.println( x + " * " + y + " = " + s );
				System.out.println( x + " * " + y + " = " + ( x * y ) );
				y++; 
			}
			
			x++;
		}
	}
}