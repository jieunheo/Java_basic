public class Example01 
{
	//Tire Ŭ������ Car Ŭ���� ���� ���� �����ϱ�
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