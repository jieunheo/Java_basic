import java.util.Scanner;

public class Example02
{
	public static void main(String[] args)
	{
		Car sonata = new Car("�Ÿ");
		Tire tx = sonata.MakeTire();
		tx.Info();
		
		
		
		
//		boolean run = true;
//		int studentNum = 0;
//		int[] scores = null;
//		Scanner scanner = new Scanner(System.in);
//		
//		while (run)
//		{
//			System.out.println("-----------------------------------------");
//			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
//			System.out.println("-----------------------------------------");
//			System.out.print("����> ");
//			
//			int selectNo = scanner.nextInt();
//			
//			if (selectNo == 1)
//			{
//				System.out.print("�л���> ");
//				int num = scanner.nextInt();
//				studentNum = num;
//				scores = new int[studentNum];
//				
//			} else if (selectNo == 2)
//			{
//				for(int i=0; i<studentNum; i++)
//				{
//					System.out.print("score[" + i + "]> ");
//					int score = scanner.nextInt();
//					scores[i] = score;
//				}
//				
//			} else if (selectNo == 3)
//			{
//				for(int i=0; i<studentNum; i++)
//				{
//					System.out.println("score[" + i + "]: " + scores[i]);
//				}
//				
//			} else if (selectNo == 4)
//			{
//				int max = 0, sum = 0;
//				for (int i=0; i<scores.length; i++)
//				{
//					if(max<scores[i]) max = scores[i];
//					sum += scores[i];
//				}
//				System.out.println("�ְ� ����: " + max);
//				System.out.println("��� ����: " + ((double)sum/studentNum));
//			} else if (selectNo == 5)
//			{
//				run = false;
//			} else {
//				System.out.println("�߸��� �Է��Դϴ�.");
//			}
//			
//		}
//		System.out.println("���α׷� ����");
	}
}