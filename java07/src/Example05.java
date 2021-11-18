public class Example05 
{
	public static void main(String[] args) 
	{
		Circle c = new Circle();
		System.out.println(c.pi);
		System.out.println(c.GetPi());

		System.out.println(Circle.pi);
		System.out.println(Circle.GetPi());
	}
}