public class Car
{
	public String name;
	
	public Car(String name)
	{
		this.name = name;
	}
	
	void PrintCar()
	{
		System.out.println("����: "+name);
	}
	
	public Tire MakeTire()
	{
		Tire t = new Tire();
		return t;
	}
}