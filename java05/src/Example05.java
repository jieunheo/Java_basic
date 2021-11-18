public class Example05 
{
	//클래스 개념 이해를 위한 예제
	public static void main(String[] args) 
	{
		//사람 클래스		Person	(이름, 나이, 생년, 주소, 전화번호, 학번)
		//공무원 시험점수		Score	(국어, 수학, 영어) - 상반기 점수, 하반기 점수
		
		Person hong = new Person();
		hong.name = "홍길동";
		hong.age = 20;
		hong.birthYear = 2011;
		hong.addr = "남원시";
		hong.tel = "063-123-4567";
		hong.hakbun = "12345";

		hong.score_a = new Score();
		hong.score_a.kor_score = 100;
		hong.score_a.math_score = 100;
		hong.score_a.eng_score = 100;

		hong.score_b = new Score();
		hong.score_b.kor_score = 100;
		hong.score_b.math_score = 100;
		hong.score_b.eng_score = 100;
		
		System.out.println("Done");
	}
}