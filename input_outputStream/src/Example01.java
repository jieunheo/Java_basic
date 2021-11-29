import java.io.IOException;
import java.io.InputStream;

public class Example01
{
	/* 입력받은 값 출력하기 */
	public static void main(String[] args)
	{
		System.out.print("값을 입력하세요 => ");
		InputStream is = System.in;
		
		try {
//			char c = (char)is.read();
//			System.out.println("입력값: " + c);
			
			byte[] b = new byte[100];
			int total;
			total = is.read(b);
			System.out.println("입력길이: " + total);
			System.out.println("입력값: [" + new String(b) + "]");
			System.out.println("입력값: [" + new String(b,0,total-2) + "]");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}