import java.io.File;

public class Example03
{
	/* ���� Ȯ���ϱ� */
	public static void main(String[] args)
	{
		String filename = "c:\\abc\\test.txt";
		File file = new File(filename);
		
		if(file.exists() == true)
		{
			System.out.println("���� ����");
		}
		
		filename = "c:\\abc";
		file = new File(filename);
		if(file.isDirectory() == true)
		{
			System.out.println("���丮��");
		}else
		{
			System.out.println("�Ϲ�������");
		}
		
		filename = "c:\\abc\\mytemp";
		file = new File(filename);
		//file.mkdir();
		file.delete();
		
	}
}