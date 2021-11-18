package ezen;

public class TVRemocon implements Remocon
{

	@Override
	public void PowerOn()
	{
		System.out.println("TVRemocon Power On");
	}

	@Override
	public void PowerOff()
	{
		System.out.println("TVRemocon Power Off");
	}
	
}