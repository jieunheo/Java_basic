import java.io.IOException;
import java.io.OutputStream;

public class Example02
{
	/* �ƽ�Ű�ڵ尪 ����ϱ� */
	public static void main(String[] args)
	{
		OutputStream os = System.out;
		try {
			for(byte b = 48; b<58; b++)
			{
			}
			os.write(10);
			
			for(byte b = 97; b<123; b++)
			{
				os.write(b);
			}
			os.write(10);
			
			String hangul = "�����ٶ󸶹ٻ������īŸ����";
			byte[] hangulBytes = hangul.getBytes();
			os.write(hangulBytes);
			
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}