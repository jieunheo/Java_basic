public class Example01 
{
	public static void main(String[] args) 
	{
		//���� ������ ����
		//int score[] = { 1, 2, 3, 4 };
		
		//���� ������ ����
		int score[] = null;
		score = new int[4];
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		
		System.out.println( "score �迭 ���� ����: " + score.length );
		for ( int i = 0; i < score.length; i++ )
		{
			System.out.println( score[i] );
		}
		
		//myScore�� score�� �����ϴ� ��ü�� �����ϴ� �ڵ�
		int myScore[] = null;
		myScore = score;
		score[0] = 99;
		System.out.println( myScore[0] );
		
	}
}