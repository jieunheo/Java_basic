import java.util.Scanner; //키보드로 값 받아오기

public class Example10
{
	public static void main(String[] args) 
	{
		//up down game 1 - do-while
		
		int count = 0; //기회 카운트
		
		//1~100사이의 랜덤한 정수값 구하기
		int hit = (int)( ( Math.random() * 100 ) % 100 ) + 1 ;
		//System.out.println( hit );

		Scanner scanner = new Scanner(System.in);		//스케너 받아오기
		
		do
		{
			System.out.print( "숫자입력: " );
			int n = scanner.nextInt();					//키보드로 값 받아오기
			System.out.println( "당신이 입력한 숫자: " + n );
			
			//숫자 비교하기
			//	컴퓨터숫자(50) > 내숫자(20) = up
			//	컴퓨터숫자(50) < 내숫자(80) = down
			//	컴퓨터숫자(50) = 내숫자(50) = 정답
			if ( hit < n )								//컴퓨터숫자 < 내숫자
			{
				System.out.println( "Down" );
				count++;								//기회 카운팅
			} else if ( hit > n )						//컴퓨터숫자 > 내숫자
			{
				System.out.println( "Up" );
				count++;								//기회 카운팅
			} else										//컴퓨터숫자 = 내숫자
			{
				System.out.println( "정답!" );
				break;									//반복문 빠져나가기
			}
			
			if ( count >= 5 ) {							//기회가 5회 넘기면
				System.out.println( "땡! 정답은 " + hit );
				break;
			}
		} while ( true );
	}
}