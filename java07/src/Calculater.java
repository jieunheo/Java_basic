public class Calculater 
{
	//더하기(add)
	static int add(int x, int y)
	{
		return x+y;
	}
	
	//뺴기(minus)
	static int minus(int x, int y)
	{
		return x-y;
	}
	
	//곱하기(mux)
	static int mux(int x, int y)
	{
		return x*y;
	}
	
	//나누기(divide)
	static int divide(int x, int y)
	{
		if(y!=0) 
		{
			return x/y;
		} else 
		{
			return 0;
		}
	}
}