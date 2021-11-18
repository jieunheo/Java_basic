import java.util.Scanner;

public class Example11 
{
	public static void main(String[] args) 
	{
		//up down game 2 - for
		
		int maxTry = 5;		//최대 도전 횟수
		int maxRange = 50;	//최대 범위
		
		//1~100사이의 랜덤한 정수값 구하기
		int hit = (int)( ( Math.random() * 100 ) % maxRange ) + 1 ;

		Scanner scanner = new Scanner(System.in);		//스케너 받아오기
		
		for ( int i = 0; i < maxTry; i++ )
		{
			System.out.println( ( maxTry - i ) + "회 남았습니다." );
			System.out.print( "숫자입력: " );
			int n = scanner.nextInt();					//키보드로 값 받아오기
			System.out.println( "당신이 입력한 숫자: " + n );
			
			if ( hit < n )
			{
				System.out.println( "Down" );
			} else if ( hit > n )
			{
				System.out.println( "Up" );
			} else
			{
				System.out.println( "정답!" );
				break;									//반복문 빠져나가기
			}
		}
		System.out.print( "게임 종료! 정답은 " + hit  );
	}
}