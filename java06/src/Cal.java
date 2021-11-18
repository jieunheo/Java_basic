//초간단 계산기 클래스
public class Cal 
{
	//출력값 없는 메소드
	void Info()
	{
		System.out.println( "Cal Info..." );
	}

	void Set(int x)
	{
		System.out.println( "x= " + x );
	}
	
	void Mul(int x, int y)
	{
		int n = x * y;
		System.out.println( x + " x " + y + " = " + n );
	}
	
	void MulList(int x)
	{
		for ( int i = 1; i <= 9; i++ )
		{
			int n = x * i;
			System.out.println( x + " x " + i + " = " + n );
		}
	}
	
	//출력값 있는 메소드
	int Add(int x, int y)
	{
		int n = x + y;
		
		return n;
	}
	
	double Add(double x, double y)
	{
		double n = x + y;
		
		return n;
	}

	int Minus(int x, int y)
	{
		int n = x - y;
		
		return n;
	}

	double Minus(double x, double y)
	{
		double n = x - y;
		
		return n;
	}

	int Mux(int x, int y)
	{
		int n = x * y;
		
		return n;
	}

	double Mux(double x, double y)
	{
		double n = x * y;
		
		return n;
	}

	int Divide(int x, int y)
	{
		if ( y != 0 )
		{
			int n = x / y;
			
			return n;
		} else
		{
			return 0;
		}
	}

	double Divide(double x, double y)
	{
		if ( y != 0 )
		{
			double n = x / y;
			
			return n;
		} else
		{
			return 0;
		}
	}
	
	int DoCal(int x, int y, String op)
	{
		int result = 0;
		
		switch (op)
		{
			case "+":
				result = Add(x, y);
				break;
			case "-":
				result = Minus(x, y);
				break;
			case "*":
				result = Mux(x, y);
				break;
			case "/":
				result = Divide(x, y);
				break;
			default:
				result = 0;
				break;
		}
		
		return result;
	}
	
	double DoCal(double x, double y, String op)
	{
		double result = 0;
		
		switch (op)
		{
			case "+":
				result = Add(x, y);
				break;
			case "-":
				result = Minus(x, y);
				break;
			case "*":
				result = Mux(x, y);
				break;
			case "/":
				result = Divide(x, y);
				break;
			default:
				result = 0;
				break;
		}
		
		return result;
	}
}