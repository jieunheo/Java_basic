package ezen;

public class Example02
{
	//인터페이스 구현
	public static void main(String[] args)
	{
		Card c = null;
		int cardType = 2;
		
		if(cardType == 0)
		{
			c = new SamsungCard();
		} else if(cardType == 1)
		{
			c = new BCCard();
		} else if(cardType == 2)
		{
			c = new VISACard();
		}
		c.Pay();
	}
}