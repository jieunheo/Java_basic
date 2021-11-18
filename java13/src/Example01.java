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
		System.out.print("\n프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		boolean run = true;
		int balance = 0;
		
		Scanner s = new Scanner(System.in);
		while (run)
		{
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			
			int n = s.nextInt();
			//if문
			if (n==1)
			{
				System.out.print("입금액> ");
				int in = s.nextInt();
				balance += in;
			} else if (n==2)
			{
				System.out.print("출금액> ");
				int out = s.nextInt();
				if (out>balance) {
					System.out.println("금액이 부족합니다.");
				} else
				{
					balance -= out;
				}
			} else if (n==3)
			{
				System.out.println("잔고> "+balance);
			} else if (n==4)
			{
				run = false;
			} else
			{
				System.out.println("유효한 값을 입력해주세요.");
			}
			
			
			//switch문
			switch (n)
			{
				case 1:
					System.out.print("입금액> ");
					int in = s.nextInt();
					balance += in;
					break;
				case 2:
					System.out.print("출금액> ");
					int out = s.nextInt();
					
					if (out>balance) {
						System.out.println("금액이 부족합니다.");
					} else
					{
						balance -= out;
					}
					break;
				case 3:
					System.out.println("잔고> "+balance);
					break;
				case 4:
					run = false;
					break;
				default:
					System.out.println("유효한 값을 입력해주세요.");
					break;
			}
		}
		System.out.print("\n프로그램 종료");
		*/
	}
}