public class Example05
{
	//StringTokenizer Ŭ������ split() �޼ҵ� ����2
	public static void main(String[] args)
	{
		String hp = "010-1234-5678";
		String[] ary = hp.split("-");
		
		System.out.println("����: "+ary.length);
		
		if(ary.length!=3)
		{
			System.out.println("��ȣ �Է� ����!");
		}
	}
}
