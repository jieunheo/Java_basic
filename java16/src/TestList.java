import java.util.ArrayList;

public class TestList
{
	/* ArrayList ���� */
	public static void main(String[] args)
	{
		ArrayList<String> ary = new ArrayList<String>();
		
		String a = "aaa";
		String b = "bbb";
		String c = "ccc";
		
		//array�� �߰�
		ary.add(a);
		ary.add(b);
		ary.add(c);
		
		//array �� ���� - ���� �ڸ��� �Ų���
		ary.remove(0);
		
		//array �� ��������
		for (int i=0; i<ary.size(); i++)
		{
			String t = ary.get(i); 
			System.out.println(t);
		}
		
		//Arraylist �޾ƿ� ��ü
		ArrayList<MemoVO> list = null;
		MemoDTO dto = new MemoDTO(); //memo ��Ʈ�ѷ�
		
		if (dto.DBOpen())
		{
			list = dto.SelectArray(); //arraylist ��������
			for (MemoVO vo : list)
			{
				vo.PrintInfo();
				System.out.println("=======================");
			}
			dto.DBClose();
		}
	}
}