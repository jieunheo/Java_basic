package ezen;

public class Person 
{
	public String name; //이름
	public int 	  age;  //나이
	public String area; //지역
	
	public Person() 
	{
		System.out.println("Person 생성자 호출");
	}
	
	public Person(int age) 
	{
		this.age = age;
		System.out.println("Person 생성자 호출: age 설정");
	}
	
	public void PrintInfo()
	{
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("지역: "+area);
	}
}