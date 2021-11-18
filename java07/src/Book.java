//도서 정보 클래스
public class Book 
{
	//필드
	private int		no;		//책번호
	private String 	title;	//제목
	private String 	author;	//저자
	private int 	have;	//소장갯수
	private int 	rent;	//대출갯수
	private int 	remain;	//잔여갯수
	
	//생성자
	Book(int no, String title, String author, int have)
	{
		this.no		= no;
		this.title	= title;
		this.author	= author;
		this.have	= have;
		this.rent	= 0;
		this.remain	= have; //잔여 갯수는 소장 갯수와 동일하게 처리
	}
	
	//도서 대출 메소드
	//리턴값: true-대출성공, false-대출실패
	boolean DoRent(int count)
	{
		if (remain>=count) //잔여갯수>=대출갯수 - 대출가능
		{
			rent += count;
			remain -= count;
			//System.out.println("대출 되었습니다. (남은 도서 갯수: "+remain+"/"+have+")");
			return true;
		} else 
		{
			//System.out.println("대출 가능한 도서가 없습니다.");
			return false;
		}
	}
	
	//도서 반납 메소드
	//리턴값: true-반납성공, false-반납실패
	boolean DoReturn(int count)
	{
		if(rent>=count) //대출갯수>=반납갯수 - 반납가능
		{
			rent -= count;
			remain += count;
			//System.out.println("반납 되었습니다. (남은 도서 갯수: "+remain+"/"+have+")");
			return true;
		} else
		{
			//System.out.println("이곳에서 대출하지 않은 도서가 있습니다.");
			return false;
		}
	}
	
	//도서 정보 출력 메소드
	void PrintInfo()
	{
		System.out.println("책번호: "+no);
		System.out.println("제목: "+title);
		System.out.println("저자: "+author);
		System.out.println("소장갯수: "+have);
		System.out.println("대출갯수: "+rent);
		System.out.println("잔여갯수: "+remain);
	}
	
	//getter
	int getNo()
	{
		return this.no;
	}
}