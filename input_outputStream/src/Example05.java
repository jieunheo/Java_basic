import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Example05
{
	/* ���� ����� */
	public static void main(String[] args)
	{
		String filename = "c:\\abc\\save.txt";
		File file = new File(filename);
		
		try
		{
			FileOutputStream os = new FileOutputStream(file);
			
			for(byte b=65; b<=90; b++)
			{
				os.write(b);
			}
			String str = "�ѱ��Դϴ�.";
			byte[] bs = str.getBytes();
			os.write(bs);
			os.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}