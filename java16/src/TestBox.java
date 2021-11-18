public class TestBox
{
	/* 제네릭 타입 */
	public static void main(String[] args)
	{
		Box<Integer> ib = new Box<Integer>();
		ib.setValue(123);
		//Integer i = (Integer)ib.getValue();
		int i = ib.getValue();
		System.out.println(i);
		
		Box<String> is = new Box<String>();
		is.setValue("aaaaaa");
		//String i = (String)ib.getValue();
		String s = is.getValue();
		System.out.println(s);
		
		
		Box<MemoVO> im = new Box<MemoVO>();
		MemoVO m = new MemoVO(1,"제목","내용","2021.11.19");
		im.setValue(m);
		
		MemoVO vo = im.getValue();
		vo.PrintInfo();
	}
}