public class Example04
{
	//StringTokenizer Ŭ������ split() �޼ҵ� ����
	public static void main(String[] args)
	{
		String score1 = "10, 99, 40, 90, 88, 100";
		//score1 = score1.replace(" ","");
		String[] score2 = score1.split(",");
		
		int n;
		int sum = 0;
		
		for(int i=0; i<score2.length; i++)
		{
			n = Integer.parseInt(score2[i].replace(" ",""));
			System.out.println("����: "+n);
			sum += n;
		}
		System.out.println("�հ�: "+sum);
		
		
	}
}