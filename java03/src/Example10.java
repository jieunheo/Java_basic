import java.util.Scanner; //Ű����� �� �޾ƿ���

public class Example10
{
	public static void main(String[] args) 
	{
		//up down game 1 - do-while
		
		int count = 0; //��ȸ ī��Ʈ
		
		//1~100������ ������ ������ ���ϱ�
		int hit = (int)( ( Math.random() * 100 ) % 100 ) + 1 ;
		//System.out.println( hit );

		Scanner scanner = new Scanner(System.in);		//���ɳ� �޾ƿ���
		
		do
		{
			System.out.print( "�����Է�: " );
			int n = scanner.nextInt();					//Ű����� �� �޾ƿ���
			System.out.println( "����� �Է��� ����: " + n );
			
			//���� ���ϱ�
			//	��ǻ�ͼ���(50) > ������(20) = up
			//	��ǻ�ͼ���(50) < ������(80) = down
			//	��ǻ�ͼ���(50) = ������(50) = ����
			if ( hit < n )								//��ǻ�ͼ��� < ������
			{
				System.out.println( "Down" );
				count++;								//��ȸ ī����
			} else if ( hit > n )						//��ǻ�ͼ��� > ������
			{
				System.out.println( "Up" );
				count++;								//��ȸ ī����
			} else										//��ǻ�ͼ��� = ������
			{
				System.out.println( "����!" );
				break;									//�ݺ��� ����������
			}
			
			if ( count >= 5 ) {							//��ȸ�� 5ȸ �ѱ��
				System.out.println( "��! ������ " + hit );
				break;
			}
		} while ( true );
	}
}