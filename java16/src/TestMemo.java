import java.util.ArrayList;

public class TestMemo
{
	/* ArrayList�� MemoVO �ֱ� */
	public static void main(String[] args)
	{
		ArrayList<MemoVO> ary = new ArrayList<MemoVO>();

		MemoVO a = null;
		a = new MemoVO(1,"����1","����1","2021.11.19");
		ary.add(a);
		a = new MemoVO(2,"����2","����2","2021.11.19");
		ary.add(a);
		
		/*
		for (MemoVO x : ary)
		{
			x.PrintInfo();
			System.out.println("=================="); 
		}
		*/
		
		for (int i=0; i<ary.size(); i++)
		{
			MemoVO x = (MemoVO)ary.get(i);
			x.PrintInfo();
			System.out.println("==================");
		}
	}
}