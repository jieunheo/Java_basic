public class Example04
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
		
		if ( n == 1 )
		{
			System.out.println( "1���� ���Խ��ϴ�." );
		} else
		{
			if ( n == 2 )
			{
				System.out.println( "2���� ���Խ��ϴ�." );
			} else
			{
				if ( n == 3 )
				{
					System.out.println( "3���� ���Խ��ϴ�." );
				} else
				{
					if ( n == 4 )
					{
						System.out.println( "4���� ���Խ��ϴ�." );
					} else
					{
						if ( n == 5 ) 
						{
							System.out.println( "5���� ���Խ��ϴ�." );
						} else
						{
							System.out.println( "6���� ���Խ��ϴ�." );
						}
					}
				}
			}
		}
	}
}
