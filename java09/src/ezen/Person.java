package ezen;

public class Person 
{
	public String name; //�̸�
	public int 	  age;  //����
	public String area; //����
	
	public Person() 
	{
		System.out.println("Person ������ ȣ��");
	}
	
	public Person(int age) 
	{
		this.age = age;
		System.out.println("Person ������ ȣ��: age ����");
	}
	
	public void PrintInfo()
	{
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		System.out.println("����: "+area);
	}
}