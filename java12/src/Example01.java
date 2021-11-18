public class Example01
{
	public static void main(String[] args) 
	{
		// [ 정정훈 ]고객님이 가입하신 전화번호는 [ 010-1234-4567 ]입니다.
		// 전화번호 [ 010-1234-4567 ]의 고객은 [ 정정훈 ]입니다.		
		String name[] = { "홍길동", "정정훈" };
		String tel[]  = { "010-1234-4567", "010-1111-2222" };
		String templateA = "[ {NAME} ]고객님이 가입하신 전화번호는 [ {TEL} ]입니다.";
		String templateB = "전화번호 [ {TEL} ]의 고객은 [ {NAME} ]입니다.";
		
		String msg = "";
		for(int i=0; i < name.length; i++)
		{
			msg = templateA;
			msg = msg.replace("{NAME}", name[i]);
			msg = msg.replace("{TEL}", tel[i]);
			System.out.println(msg);
			
			msg = templateB;
			msg = msg.replace("{NAME}", name[i]);
			msg = msg.replace("{TEL}", tel[i]);
			System.out.println(msg);			
		}
		
	}

}
