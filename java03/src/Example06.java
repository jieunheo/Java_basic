public class Example06 
{
	public static void main(String[] args) 
	{
		//Ȧ���� ���ϴ� ���α׷�
		int sum = 0;
		for ( int i = 1 ; i <= 10 ; i+=2 )
		{
			sum = sum + i; //sum += i;
		}
		System.out.println( sum );
	}
}