public class Example03 
{
	public static void main(String[] args) 
	{
		BingoGame game = new BingoGame();
		//game.DoPlay();
		//System.out.println("프로그램이 종료되었습니다.");
		
		do
		{
			game.DoPlay();
			System.out.println("한판 더? 1=Yes, 0=No :");
			int key = game.GetKeyIn();
			if(key == 0)
			{
				break;
			}
		}while(true);
		System.out.println("프로그램이 종료되었습니다.");
	}
}
