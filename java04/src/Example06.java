public class Example06 
{
	public static void main(String[] args) 
	{
		TrafficLight tr = TrafficLight.RED_LIGHT;
		
		switch ( tr )
		{
			case RED_LIGHT:
				System.out.println( "������" );
				break;
			case GREEN_LIGHT:
				System.out.println( "���" );
				break;
			case YRLLOW_LIGHT: 
				System.out.println( "��Ȳ��" );
				break;
		}
	}
}