public class Example06 
{
	//클래스의 메소드 이해
	public static void main(String[] args) 
	{
		Saram hong = new Saram();
		//hong.name = "홍길동";
		//hong.birthYear = 2000;
		//hong.age = 2021 - hong.birthYear;

		hong.setName( "홍길동" );
		hong.setAge( 10 );
		
		hong.Print();
		
		Saram chon = new Saram();
		chon.setName( "성춘향" );
		chon.setAge( 16 );
		
		chon.Print();
	}
}