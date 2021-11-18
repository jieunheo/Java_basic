public class Example06 
{
	public static void main(String[] args) 
	{
		int n;
		Calculater c = new Calculater();
		
		n = c.add(1, 1);
		n = c.minus(1, 1);
		n = c.mux(1, 1);
		n = c.divide(1, 1);

		n = Calculater.add(1, 1);
		n = Calculater.minus(1, 1);
		n = Calculater.mux(1, 1);
		n = Calculater.divide(1, 1);
	}
}