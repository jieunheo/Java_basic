import java.util.Scanner;

public class Example01
{
	public static void main(String[] args)
	{
		Bank jb = new Bank();
		System.out.println("=======jb=======");
		jb.RunBank();
		
		Bank nh = new Bank();
		System.out.println("=======nh=======");
		nh.RunBank();
		System.out.print("\n���α׷� ����");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		boolean run = true;
		int balance = 0;
		
		Scanner s = new Scanner(System.in);
		while (run)
		{
			System.out.println("--------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------");
			System.out.print("����> ");
			
			int n = s.nextInt();
			//if��
			if (n==1)
			{
				System.out.print("�Աݾ�> ");
				int in = s.nextInt();
				balance += in;
			} else if (n==2)
			{
				System.out.print("��ݾ�> ");
				int out = s.nextInt();
				if (out>balance) {
					System.out.println("�ݾ��� �����մϴ�.");
				} else
				{
					balance -= out;
				}
			} else if (n==3)
			{
				System.out.println("�ܰ�> "+balance);
			} else if (n==4)
			{
				run = false;
			} else
			{
				System.out.println("��ȿ�� ���� �Է����ּ���.");
			}
			
			
			//switch��
			switch (n)
			{
				case 1:
					System.out.print("�Աݾ�> ");
					int in = s.nextInt();
					balance += in;
					break;
				case 2:
					System.out.print("��ݾ�> ");
					int out = s.nextInt();
					
					if (out>balance) {
						System.out.println("�ݾ��� �����մϴ�.");
					} else
					{
						balance -= out;
					}
					break;
				case 3:
					System.out.println("�ܰ�> "+balance);
					break;
				case 4:
					run = false;
					break;
				default:
					System.out.println("��ȿ�� ���� �Է����ּ���.");
					break;
			}
		}
		System.out.print("\n���α׷� ����");
		*/
	}
}