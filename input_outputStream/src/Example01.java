import java.io.IOException;
import java.io.InputStream;

public class Example01
{
	/* �Է¹��� �� ����ϱ� */
	public static void main(String[] args)
	{
		System.out.print("���� �Է��ϼ��� => ");
		InputStream is = System.in;
		
		try {
//			char c = (char)is.read();
//			System.out.println("�Է°�: " + c);
			
			byte[] b = new byte[100];
			int total;
			total = is.read(b);
			System.out.println("�Է±���: " + total);
			System.out.println("�Է°�: [" + new String(b) + "]");
			System.out.println("�Է°�: [" + new String(b,0,total-2) + "]");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}