import java.util.Scanner;

//UP/DOWN 게임 Version 0.3
public class BingoGame 
{
	//최대 도전 횟수
	int maxtry;
	//최대 범위
	int maxrange;
	//정답
	int hit;
	//키보드 입력
	Scanner scanner;
	
	BingoGame()
	{
		maxtry   = 5;
		maxrange = 50;
		
		//1 ~ 50사이의 랜덤한 정수값을 만들어낸다.
		hit = (int)((Math.random() * 100) % maxrange) + 1;
		
		scanner = new Scanner(System.in);
	}
	
	//키보드 입력을 받는다.
	int GetKeyIn()
	{
		return scanner.nextInt();
	}
	
	//게임을 실행한다.
	void DoPlay() 
	{
		int keyIn;
		boolean iscorrect = false;
		
		System.out.println("Bingo 게임 Version 0.3");
		System.out.println("=====================");
		
		for(int i=0; i < maxtry; i++)
		{
			System.out.println("==>" + (maxtry - i) + "회 남았습니다.");
			System.out.print("숫자입력:");
			keyIn = GetKeyIn();
			//System.out.println("당신이 입력한 숫자:" + scanner);

			//컴퓨터숫자(50) > 내꺼 숫자(10) : UP
			//컴퓨터숫자(50) < 내꺼 숫자(60) : DOWN
			//컴퓨터숫자(50) = 내꺼 숫자(5) : 정답!! 
			if( hit > keyIn)
			{
				//컴퓨터숫자(50) > 내꺼 숫자(10) : UP
				System.out.println("==> UP!!!");
			}else if ( hit < keyIn)
			{
				//컴퓨터숫자(50) < 내꺼 숫자(60) : DOWN
				System.out.println("==>DOWN!!!");
			}else
			{
				//컴퓨터숫자(50) = 내꺼 숫자(5) : 정답!!
				System.out.println("==> 정답!!");
				iscorrect = true;
				break;
			}
		}
		if( iscorrect == false)
		{
			System.out.println("정답은 [ " + hit + " ]입니다.");
		}
		System.out.println("게임이 종료되었습니다.");			
	}

	
	
}
