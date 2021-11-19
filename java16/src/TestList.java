import java.util.ArrayList;

public class TestList
{
	/* ArrayList 연습 */
	public static void main(String[] args)
	{
		ArrayList<String> ary = new ArrayList<String>();
		
		String a = "aaa";
		String b = "bbb";
		String c = "ccc";
		
		//array에 추가
		ary.add(a);
		ary.add(b);
		ary.add(c);
		
		//array 값 삭제 - 빠진 자리는 매꿔짐
		ary.remove(0);
		
		//array 값 가져오기
		for (int i=0; i<ary.size(); i++)
		{
			String t = ary.get(i); 
			System.out.println(t);
		}
		
		//Arraylist 받아올 객체
		ArrayList<MemoVO> list = null;
		MemoDTO dto = new MemoDTO(); //memo 컨트롤러
		
		if (dto.DBOpen())
		{
			list = dto.SelectArray(); //arraylist 가져오기
			for (MemoVO vo : list)
			{
				vo.PrintInfo();
				System.out.println("=======================");
			}
			dto.DBClose();
		}
	}
}