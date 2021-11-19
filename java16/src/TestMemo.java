import java.util.ArrayList;

public class TestMemo
{
	/* ArrayList에 MemoVO 넣기 */
	public static void main(String[] args)
	{
		ArrayList<MemoVO> ary = new ArrayList<MemoVO>();

		MemoVO a = null;
		a = new MemoVO(1,"제목1","내용1","2021.11.19");
		ary.add(a);
		a = new MemoVO(2,"제목2","내용2","2021.11.19");
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