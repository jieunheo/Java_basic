public class Example05
{
	//StringTokenizer 클래스의 split() 메소드 예제2
	public static void main(String[] args)
	{
		String hp = "010-1234-5678";
		String[] ary = hp.split("-");
		
		System.out.println("갯수: "+ary.length);
		
		if(ary.length!=3)
		{
			System.out.println("번호 입력 오류!");
		}
	}
}
