package ezen;

public class Example01
{
	public static void main(String[] args)
	{
		Remocon r = null;
		r = new TVRemocon();
		r.PowerOn();
		
		r = new AVRemocon();
		r.PowerOn();
	}
}