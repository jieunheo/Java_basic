import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example06
{
	/* ���� �����ϱ� */
	public static void main(String[] args)
	{
		File srcFile    = new File("c:\\abc\\dog.jpg");
		File targetFile = new File("c:\\abc\\dog2.jpg");
		
		try
		{
			FileInputStream srcIS = new FileInputStream(srcFile);
			FileOutputStream taergetOS = new FileOutputStream(targetFile);
			
			int total = 0;
			byte[] data = new byte[4098];
			
			do
			{
				total = srcIS.read(data);
				System.out.println("�о���� ����Ʈ ��: " + total);
				if(total != -1)
				{
					taergetOS.write(data,0,total);
				}
			} while(total != -1);
			srcIS.close();
			taergetOS.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}