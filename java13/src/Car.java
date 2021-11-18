public class Car
{
	public String name;
	
	public Car(String name)
	{
		this.name = name;
	}
	
	void PrintCar()
	{
		System.out.println("ย๗มพ: "+name);
	}
	
	public Tire MakeTire()
	{
		Tire t = new Tire();
		return t;
	}
}