public class Example06 
{
	public static void main(String[] args) 
	{
		//�������� �����Ѵ�.
		double r = Math.random();
		System.out.println( "������ 1: " + r );
		
		r = r * 100;
		System.out.println( "������ 2: " + r );
		
		int n = (int)r;
		n = ( n % 6 ) + 1; //1~6 ������ ������ ��
		System.out.println( "������ 3: " + n );
		
		switch ( n )
		{
			case 1:
				System.out.println( "1���� ���Խ��ϴ�." );
				break;
			case 2:
				System.out.println( "2���� ���Խ��ϴ�." );
				break;
			case 3:
				System.out.println( "3���� ���Խ��ϴ�." );
				break;
			case 4:
				System.out.println( "4���� ���Խ��ϴ�." );
				break;
			case 5:
				System.out.println( "5���� ���Խ��ϴ�." );
				break;
			default:
				System.out.println( "6���� ���Խ��ϴ�." );
				break;
		
		}
	}
}
