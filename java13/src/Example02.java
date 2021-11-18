import java.util.Scanner;

public class Example02
{
	public static void main(String[] args)
	{
		Car sonata = new Car("쏘나타");
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
//			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
//			System.out.println("-----------------------------------------");
//			System.out.print("선택> ");
//			
//			int selectNo = scanner.nextInt();
//			
//			if (selectNo == 1)
//			{
//				System.out.print("학생수> ");
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
//				System.out.println("최고 점수: " + max);
//				System.out.println("평균 점수: " + ((double)sum/studentNum));
//			} else if (selectNo == 5)
//			{
//				run = false;
//			} else {
//				System.out.println("잘못된 입력입니다.");
//			}
//			
//		}
//		System.out.println("프로그램 종료");
	}
}