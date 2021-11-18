import Hundai.*;
import Kia.*;
import Samsung.*;

public class Example01 
{
	//패키지 선언 연습
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