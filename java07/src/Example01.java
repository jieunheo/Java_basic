import java.util.Scanner;

public class Example01 
{
	//���� �뿩���� ���α׷� V0.1
	public static void main(String[] args) 
	{
		Book[] books = null;
		books = new Book[3];
		books[0] = new Book(1,"�̰��� �ڹٴ�. 1��","ȫ�浿",2);
		books[1] = new Book(2,"�̰��� �ڹٴ�. 2��","ȫ�浿",2);
		books[2] = new Book(3,"�̰��� �ڹٴ�. 3��","ȫ�浿",2);
		
		Scanner sc = new Scanner(System.in);
		
		int menuno, bookno;
		boolean isContinue = true;
		
		do
		{
			System.out.println("���� �뿩���� ���α׷� V0.1");
			System.out.println("============================");
			System.out.println("1. ������� ��ȸ");
			System.out.println("2. ��������");
			System.out.println("3. ����ݳ�");
			System.out.println("4. ���α׷� ����");
			
			System.out.print("�޴�: ");
			menuno = sc.nextInt();
			
			System.out.println("������ �޴��� "+menuno+"�Դϴ�.");
			
			switch(menuno)
			{
			case 1: //���� ��� ���
				System.out.println("****************");
				for(int i=0; i<books.length; i++)
				{
					books[i].PrintInfo();
					System.out.println("****************");
				}
				break;
			case 2: //���� ����
				System.out.println("****************");
				System.out.println("�����Ͻ� ���� ��ȣ�� �Է��ϼ���.");
				
				System.out.print("������ȣ: ");
				bookno = sc.nextInt();
				
				for(int i=0; i<books.length; i++)
				{
					if(bookno==books[i].getNo())
					{
						//books[i].DoRent(1);
						if(books[i].DoRent(1)==true) //books[i].DoRent(1) ���� �� ������� ����
						{
							System.out.println("===> ���� �Ϸ�");
						} else
						{
							System.out.println("===> ���� ����");
						}
						System.out.println("****************");
						break;
					}
				}
				break;
			case 3: //���� �ݳ�
				System.out.println("****************");
				System.out.println("�ݳ��Ͻ� ���� ��ȣ�� �Է��ϼ���.");
				
				System.out.print("������ȣ: ");
				bookno = sc.nextInt();
				
				for(int i=0; i<books.length; i++)
				{
					if(bookno==books[i].getNo())
					{
						if(books[i].DoReturn(1)==true) //books[i].DoReturn(1) ���� �� ������� ����
						{
							System.out.println("===> �ݳ� �Ϸ�");
						} else
						{
							System.out.println("===> �ݳ� ����");
						}
						System.out.println("****************");
						break;
					}
				}
				
				break;
			case 4: 
				isContinue = false;
				break;
			default:
				System.out.println("�޴� ��ȣ�� �ٽ� Ȯ�� ���ּ���.");
				System.out.println("--------------------------");
				break;
			}
		} while(isContinue);

		System.out.println("============================");
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}