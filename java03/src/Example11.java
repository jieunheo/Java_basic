import java.util.Scanner;

public class Example11 
{
	public static void main(String[] args) 
	{
		//up down game 2 - for
		
		int maxTry = 5;		//�ִ� ���� Ƚ��
		int maxRange = 50;	//�ִ� ����
		
		//1~100������ ������ ������ ���ϱ�
		int hit = (int)( ( Math.random() * 100 ) % maxRange ) + 1 ;

		Scanner scanner = new Scanner(System.in);		//���ɳ� �޾ƿ���
		
		for ( int i = 0; i < maxTry; i++ )
		{
			System.out.println( ( maxTry - i ) + "ȸ ���ҽ��ϴ�." );
			System.out.print( "�����Է�: " );
			int n = scanner.nextInt();					//Ű����� �� �޾ƿ���
			System.out.println( "����� �Է��� ����: " + n );
			
			if ( hit < n )
			{
				System.out.println( "Down" );
			} else if ( hit > n )
			{
				System.out.println( "Up" );
			} else
			{
				System.out.println( "����!" );
				break;									//�ݺ��� ����������
			}
		}
		System.out.print( "���� ����! ������ " + hit  );
	}
}