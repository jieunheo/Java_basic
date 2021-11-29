import java.io.File;

public class Example03
{
	/* 파일 확인하기 */
	public static void main(String[] args)
	{
		String filename = "c:\\abc\\test.txt";
		File file = new File(filename);
		
		if(file.exists() == true)
		{
			System.out.println("파일 있음");
		}
		
		filename = "c:\\abc";
		file = new File(filename);
		if(file.isDirectory() == true)
		{
			System.out.println("디렉토리임");
		}else
		{
			System.out.println("일반파일임");
		}
		
		filename = "c:\\abc\\mytemp";
		file = new File(filename);
		//file.mkdir();
		file.delete();
		
	}
}