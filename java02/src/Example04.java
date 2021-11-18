public class Example04
{
	public static void main(String[] args)
	{
		//랜덤값을 생성한다.
		double r = Math.random();
		System.out.println( "랜덤값 1: " + r );
		
		r = r * 100;
		System.out.println( "랜덤값 2: " + r );
		
		int n = (int)r;
		n = ( n % 6 ) + 1; //1~6 사이의 랜덤한 수
		System.out.println( "랜덤값 3: " + n );
		
		if ( n == 1 )
		{
			System.out.println( "1값이 나왔습니다." );
		} else
		{
			if ( n == 2 )
			{
				System.out.println( "2값이 나왔습니다." );
			} else
			{
				if ( n == 3 )
				{
					System.out.println( "3값이 나왔습니다." );
				} else
				{
					if ( n == 4 )
					{
						System.out.println( "4값이 나왔습니다." );
					} else
					{
						if ( n == 5 ) 
						{
							System.out.println( "5값이 나왔습니다." );
						} else
						{
							System.out.println( "6값이 나왔습니다." );
						}
					}
				}
			}
		}
	}
}
