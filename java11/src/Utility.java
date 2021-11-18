import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility 
{
	public static boolean IsNumber(String str)
	{
		try
		{
			str = str.replace(",","");
			Integer.parseInt(str);
			
			//숫자 맞음
			return true;
		}catch(Exception e)
		{
			//숫자가 아님
			return false;
		}		
	}
	
	public static int ToNumber(String str)
	{
		str = str.replace(",","");
		return Integer.parseInt(str);		
	}
	
	public static int MakeSum(String str)
	{
		String score[] = str.split(",");
		int sum = 0;
		for(int i=0; i < score.length; i++)
		{
			score[i] = score[i].replace(" " , "");
			sum = sum + Integer.parseInt(score[i]);
		}		
		return sum;
	}
	
	public static String NowDate()
	{
		return NowDate("yyyy년 MM월 dd일 hh시 mm분 ss초");
	}
	
	public static String NowDate(String format)
	{
		Date now = new Date();
		String strNow1 = now.toString();
		//System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String strNow2 = sdf.format(now);
		//System.out.println(strNow2);
		
		return strNow2;
	}
}
