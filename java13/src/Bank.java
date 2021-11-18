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
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("--------------------------");
	}
	
	public void RunBank()
	{
		boolean run = true;
		
		while(run)
		{
			PrintMenu();
			System.out.print("선택> ");
			int menu = scanner.nextInt();
			
			if (menu == 1)
			{
				System.out.print("입금액> ");
				int in = scanner.nextInt();
				balance += in;
			} else if (menu == 2)
			{
				System.out.print("출금액> ");
				int out = scanner.nextInt();
				if (out>balance)
				{
					System.out.println("금액이 부족합니다. (잔액:"+balance+")");
				} else {
					balance -= out;
				}
			} else if (menu == 3)
			{
				System.out.println("잔고> "+balance);
			} else if (menu == 4)
			{
				run = false;
			} else
			{
				System.out.println("유효한 값이 아닙니다.");
			}
		}
	}
	
	
	
}