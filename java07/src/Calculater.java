public class Calculater 
{
	//���ϱ�(add)
	static int add(int x, int y)
	{
		return x+y;
	}
	
	//����(minus)
	static int minus(int x, int y)
	{
		return x-y;
	}
	
	//���ϱ�(mux)
	static int mux(int x, int y)
	{
		return x*y;
	}
	
	//������(divide)
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