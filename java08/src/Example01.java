import Hundai.*;
import Kia.*;
import Samsung.*;

public class Example01 
{
	//��Ű�� ���� ����
	public static void main(String[] args) 
	{
		Hundai.Car car1 = new Hundai.Car();
		car1.Info();
		
		Kia.Car car2 = new Kia.Car();
		car2.Info();
		
		Samsung.Car car3 = new Samsung.Car();
		car3.Info();
	}
}