public class Example01
{
	public static void main(String[] args) 
	{
		// [ ������ ]������ �����Ͻ� ��ȭ��ȣ�� [ 010-1234-4567 ]�Դϴ�.
		// ��ȭ��ȣ [ 010-1234-4567 ]�� ���� [ ������ ]�Դϴ�.		
		String name[] = { "ȫ�浿", "������" };
		String tel[]  = { "010-1234-4567", "010-1111-2222" };
		String templateA = "[ {NAME} ]������ �����Ͻ� ��ȭ��ȣ�� [ {TEL} ]�Դϴ�.";
		String templateB = "��ȭ��ȣ [ {TEL} ]�� ���� [ {NAME} ]�Դϴ�.";
		
		String msg = "";
		for(int i=0; i < name.length; i++)
		{
			msg = templateA;
			msg = msg.replace("{NAME}", name[i]);
			msg = msg.replace("{TEL}", tel[i]);
			System.out.println(msg);
			
			msg = templateB;
			msg = msg.replace("{NAME}", name[i]);
			msg = msg.replace("{TEL}", tel[i]);
			System.out.println(msg);			
		}
		
	}

}
