package ezen;

public class Student extends Person
{
	public String hakbun;	//�й�
	public String subject;	//�а�

	Student() 
	{
		age = 20;
		System.out.println("Student ������ ȣ��");
	}
	
	@Override
	public void PrintInfo()
	{
		/*
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		System.out.println("����: "+area);
		*/
		super.PrintInfo();
		System.out.println("�й�: "+hakbun);
		System.out.println("�а�: "+subject);
	}
}
