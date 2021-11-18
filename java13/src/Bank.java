import java.util.Scanner;

public class Bank
{
	private int balance;
	private Scanner scanner;
	
	public Bank() {
		balance = 0;
		scanner = new Scanner(System.in);
	}
	
	private void PrintMenu()
	{
		System.out.println("--------------------------");
		System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
		System.out.println("--------------------------");
	}
	
	public void RunBank()
	{
		boolean run = true;
		
		while(run)
		{
			PrintMenu();
			System.out.print("����> ");
			int menu = scanner.nextInt();
			
			if (menu == 1)
			{
				System.out.print("�Աݾ�> ");
				int in = scanner.nextInt();
				balance += in;
			} else if (menu == 2)
			{
				System.out.print("��ݾ�> ");
				int out = scanner.nextInt();
				if (out>balance)
				{
					System.out.println("�ݾ��� �����մϴ�. (�ܾ�:"+balance+")");
				} else {
					balance -= out;
				}
			} else if (menu == 3)
			{
				System.out.println("�ܰ�> "+balance);
			} else if (menu == 4)
			{
				run = false;
			} else
			{
				System.out.println("��ȿ�� ���� �ƴմϴ�.");
			}
		}
	}
	
	
	
}