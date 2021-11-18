public class Example05 
{
	public static void main(String[] args) 
	{
		int[] score = { 99, 88, 77, 66 };
		
		for ( int i = 0; i < score.length; i++ )
		{
			System.out.println( score[i] );
		}
		
		System.out.println( "------------------" );
		
		//향상된 for문
		for ( int item : score )
		{
			System.out.println( item );
		}
	}
}