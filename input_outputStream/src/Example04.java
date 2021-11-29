import java.io.File;
import java.io.FileInputStream;

public class Example04
{
	/* 파일 읽어오기 */
	public static void main(String[] args)
	{
		String filename = "c:\\abc\\test.txt";
		File file = new File(filename);
		
		if(file.exists() == false)
		{
			System.out.println("파일 없음");
			return;
		}
		
		try
		{
			FileInputStream fs = new FileInputStream(file);
			/*
			int c;
			do
			{
				c = fs.read();
				if(c != -1)
				{
					System.out.println((char)c);
				}
			} while(c != -1);
			*/
			
			int total = 0;
			byte[] b = new byte[10];
			do
			{
				total = fs.read(b);
				if(total != -1)
				{
					System.out.println("[" + new String(b, 0, total) + "]");
				}
			} while(total != -1);
			
			fs.close(); //꼭 닫기
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}