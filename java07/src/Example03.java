public class Example03 
{
	public static void main(String[] args) 
	{
		BingoGame game = new BingoGame();
		//game.DoPlay();
		//System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		do
		{
			game.DoPlay();
			System.out.println("���� ��? 1=Yes, 0=No :");
			int key = game.GetKeyIn();
			if(key == 0)
			{
				break;
			}
		}while(true);
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
