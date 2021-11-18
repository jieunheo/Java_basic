public class Example01 
{
	public static void main(String[] args) 
	{
		//정적 데이터 선언
		//int score[] = { 1, 2, 3, 4 };
		
		//동적 데이터 선언
		int score[] = null;
		score = new int[4];
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		
		System.out.println( "score 배열 원소 개수: " + score.length );
		for ( int i = 0; i < score.length; i++ )
		{
			System.out.println( score[i] );
		}
		
		//myScore에 score가 참조하는 객체를 지정하는 코드
		int myScore[] = null;
		myScore = score;
		score[0] = 99;
		System.out.println( myScore[0] );
		
	}
}