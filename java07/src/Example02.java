import java.util.Scanner;

public class Example02
{
	//���� �뿩���� ���α׷� V0.2
	public static void main(String[] args)
	{
		Library lib = new Library();
		Scanner sc = new Scanner(System.in);
		int menuno, bookno;
		
		do
		{
			lib.PrintMenu();
			
			System.out.print("�޴�: ");
			menuno = sc.nextInt();
			
			System.out.println("������ �޴��� "+menuno+"�Դϴ�.");
			
			if(menuno==1)		 //���� ��� 
			{
				lib.PrintList();
			} else if(menuno==2) //���� ����
			{
				System.out.println("****************");
				System.out.println("�����Ͻ� ���� ��ȣ�� �Է��ϼ���.");
				
				System.out.print("������ȣ: ");
				bookno = sc.nextInt();
				
				lib.Rent(bookno);
				//lib.Process(bookno, menuno);
				lib.PrintList(bookno);
			} else if(menuno==3) //���� �ݳ�
			{
				System.out.println("****************");
				System.out.println("�ݳ��Ͻ� ���� ��ȣ�� �Է��ϼ���.");
				
				System.out.print("������ȣ: ");
				bookno = sc.nextInt();
				
				lib.Return(bookno);
				//lib.Process(bookno, menuno);
				lib.PrintList(bookno);
			} else if(menuno==4) //����
			{
				break;
			} else				 //�Է� ����
			{
				System.out.println("�޴� ��ȣ�� �ٽ� Ȯ�� ���ּ���.");
				System.out.println("--------------------------");
			}
		} while(true);

		System.out.println("============================");
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}