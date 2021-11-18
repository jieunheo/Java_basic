public class Example02
{
	public static void main(String[] args) 
	{
		int[] a = { 1, 2 };
		int[] b = { 3, 4 };
		int[] c = null;
		
		//a가 참조하는 객체(힙 메모리에 있는 데이터)를 c도 참조하게 한다.
		c = a;
		
		boolean f;
		f = ( b == c );	//b와 c가 참조하는 객체가 동일한지 검사한다.
		System.out.println( f );

		f = ( a == c );	//a와 c가 참조하는 객체가 동일한지 검사한다.
		System.out.println( f );
		
		
		//배열을 동적으로 만드는 코드
		int[] score = null;
		//score = { 1, 2, 3, 4 }; //컴파일 에러
		score = new int[4]; //새로운 배열 데이터 영역을 만든다.
		//데이터를 초기화(설정)한다.
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		
		//새로운 배열 데이터 영역을 만들고, 데이터를 초기화 한다.
		score = new int[] { 1, 2, 3, 4 };
	}
}