import java.util.Scanner;

//UP/DOWN ���� Version 0.3
public class BingoGame 
{
	//�ִ� ���� Ƚ��
	int maxtry;
	//�ִ� ����
	int maxrange;
	//����
	int hit;
	//Ű���� �Է�
	Scanner scanner;
	
	BingoGame()
	{
		maxtry   = 5;
		maxrange = 50;
		
		//1 ~ 50������ ������ �������� ������.
		hit = (int)((Math.random() * 100) % maxrange) + 1;
		
		scanner = new Scanner(System.in);
	}
	
	//Ű���� �Է��� �޴´�.
	int GetKeyIn()
	{
		return scanner.nextInt();
	}
	
	//������ �����Ѵ�.
	void DoPlay() 
	{
		int keyIn;
		boolean iscorrect = false;
		
		System.out.println("Bingo ���� Version 0.3");
		System.out.println("=====================");
		
		for(int i=0; i < maxtry; i++)
		{
			System.out.println("==>" + (maxtry - i) + "ȸ ���ҽ��ϴ�.");
			System.out.print("�����Է�:");
			keyIn = GetKeyIn();
			//System.out.println("����� �Է��� ����:" + scanner);

			//��ǻ�ͼ���(50) > ���� ����(10) : UP
			//��ǻ�ͼ���(50) < ���� ����(60) : DOWN
			//��ǻ�ͼ���(50) = ���� ����(5) : ����!! 
			if( hit > keyIn)
			{
				//��ǻ�ͼ���(50) > ���� ����(10) : UP
				System.out.println("==> UP!!!");
			}else if ( hit < keyIn)
			{
				//��ǻ�ͼ���(50) < ���� ����(60) : DOWN
				System.out.println("==>DOWN!!!");
			}else
			{
				//��ǻ�ͼ���(50) = ���� ����(5) : ����!!
				System.out.println("==> ����!!");
				iscorrect = true;
				break;
			}
		}
		if( iscorrect == false)
		{
			System.out.println("������ [ " + hit + " ]�Դϴ�.");
		}
		System.out.println("������ ����Ǿ����ϴ�.");			
	}

	
	
}
