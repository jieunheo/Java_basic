public class Example01 
{
	//학생들의 총점,평균 구하기 Version 0.1
	public static void main(String[] args) 
	{
		//홍길동-70
		//김길동-90
		//성춘향-100
		//이몽룡-60
		//김춘자-100
		//이순신-77

		int[] score = { 70, 90, 100, 60, 100, 77 };
		int sum = 0, avg = sum/score.length;
		
		for ( int i = 0; i < score.length; i++ ) //향상된 for문 -> int item : score
		{
			sum += score[i];
		}
		System.out.println( "총점= " + sum );
		System.out.println( "퍙균= " + avg );
	}
}