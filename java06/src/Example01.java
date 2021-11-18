public class Example01 
{
	//Tire 클래스와 Car 클래스 간의 관계 이해하기
	public static void main(String[] args) 
	{
		Car sonata = new Car();
		//sonata.frontLeft.Print();
		
		sonata.SpeedUp();
		sonata.SpeedDown();
		
		Car imsi = sonata;
		imsi.frontLeft.Print();
		imsi.frontLeft.setInch( 20 );
		
		sonata.frontLeft.Print();
	}
}