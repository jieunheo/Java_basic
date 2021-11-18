public class Example03 
{
	//학생들의 총점,평균 구하기 Version 0.3
	public static void main(String[] args) 
	{
		//홍길동-70 (전주)
		//김길동-90 (군산)
		//성춘향-100 (익산)
		//이몽룡-60 (완주)
		//김춘자-100 (전주)
		//이순신-77 (서울)

		String[] names = { "홍길동", "김길동", "성춘향", "이몽룡", "김춘자", "이순신" };
		String[] areas = { "전주", "군산", "익산", "완주", "전주", "서울" };
		int[] score = { 70, 90, 100, 60, 100, 77 };
		int sum = 0, avg = sum/score.length;
		
		for ( int i = 0; i < score.length; i++ )
		{
			System.out.println( names[i] + "(" + areas[i] + ")= " + score[i] );
			sum += score[i];
		}
		System.out.println( "---------------------" );
		System.out.println( "총점= " + sum );
		System.out.println( "퍙균= " + avg );
	}
}
