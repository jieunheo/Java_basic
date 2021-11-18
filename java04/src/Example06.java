public class Example06 
{
	public static void main(String[] args) 
	{
		TrafficLight tr = TrafficLight.RED_LIGHT;
		
		switch ( tr )
		{
			case RED_LIGHT:
				System.out.println( "»¡°£»ö" );
				break;
			case GREEN_LIGHT:
				System.out.println( "³ì»ö" );
				break;
			case YRLLOW_LIGHT: 
				System.out.println( "ÁÖÈ²»ö" );
				break;
		}
	}
}