public class Example02
{
	public static void main(String[] args)
	{
		int gender = 0; //0:여자, 1:남자
		int age = 24;
		
		if ( gender == 0 )
		{
			if ( (age >= 10) && (age < 20) )
			{
				System.out.println("10대 여자입니다.");
			} else
			{
				System.out.println("10대가 아닌 여자입니다.");
			}
		} else
		{
			if ( (age >= 10) && (age < 20) )
			{
				System.out.println("10대 남자입니다.");
			} else
			{
				System.out.println("10대가 아닌 남자입니다.");
			}
		}
	}

}
