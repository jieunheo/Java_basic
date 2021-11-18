package ezen;

public class Example01 
{
	//상속 관련 예제
	public static void main(String[] args) 
	{
		Student p = new Student();
		p.name	  = "홍길동";
		p.area	  = "전주";
		p.age	  = 20;
		p.hakbun  = "20210101";
		p.subject = "프로그래밍 학과";
		p.PrintInfo();
	}
}