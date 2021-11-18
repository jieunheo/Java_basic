public class Example03 
{
	//메소드 작성 연습
	public static void main(String[] args) 
	{
		Cal c = new Cal();
		/*
		c.Info();
		c.Set( 10 );
		c.Mul( 2, 3 );
		
		for ( int x = 1; x <= 9; x++ )
		{
			for ( int y = 1; y <= 9; y++ )
			{
				c.Mul(x, y);
			}
		}
		for ( int x = 1; x <= 9; x++)
		{
			System.out.println( "=====" + x + "=====" );
			c.MulList( x );
		}
		
		int k = c.Add( 10, 20 );
		System.out.println( "k= " + k );
		k = c.Minus( 30, 10 );
		System.out.println( "k= " + k );
		k = c.Mux( 4, 6 );
		System.out.println( "k= " + k );
		k = c.Divide( 20, 0 );
		System.out.println( "k= " + k );
		*/
		
		
		int x = 10;
		int y = 2;
		int result = 0;
		String op = "-";

		result = c.DoCal(x, y, op);
		System.out.println( x + op + y + "=" + result );
		
	}
}