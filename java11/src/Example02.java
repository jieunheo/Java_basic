public class Example02
{
	//String Ŭ���� ����2
	public static void main(String[] args)
	{
		String s1 = new String("a bc     ");
		String s2 = new String("        AB C");

		s1 = s1.trim();
		s2 = s2.trim();
		s1 = s1.replace(" ","");
		s2 = s2.replace(" ","");
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		if(s1.equals(s2)==true)
		{
			System.out.println("�ΰ��� ���ڰ� �����մϴ�.");
		} else
		{
			System.out.println("�ΰ��� ���ڰ� �ٸ��ϴ�.");
		}
	}
}