package ezen;

public class AVRemocon implements Remocon
{

	@Override
	public void PowerOn()
	{
		System.out.println("AVRemocon Power On");
	}

	@Override
	public void PowerOff()
	{
		System.out.println("AVRemocon Power Off");
	}
	
}