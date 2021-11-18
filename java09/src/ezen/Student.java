package ezen;

public class Student extends Person
{
	public String hakbun;	//학번
	public String subject;	//학과

	Student() 
	{
		age = 20;
		System.out.println("Student 생성자 호출");
	}
	
	@Override
	public void PrintInfo()
	{
		/*
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("지역: "+area);
		*/
		super.PrintInfo();
		System.out.println("학번: "+hakbun);
		System.out.println("학과: "+subject);
	}
}
