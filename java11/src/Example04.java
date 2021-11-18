public class Example04
{
	//StringTokenizer 클래스의 split() 메소드 예제
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
			System.out.println("점수: "+n);
			sum += n;
		}
		System.out.println("합계: "+sum);
		
		
	}
}