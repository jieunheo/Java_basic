public class Example03 
{
	public static void main(String[] args) 
	{
		//������ ��� ���α׷�
		int x = 1;
		int y = 1;
		
		while ( x <= 9 )
		{
			//System.out.println( "x = " + x );
			System.out.println( "----" + x + "�� ----" );
			
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