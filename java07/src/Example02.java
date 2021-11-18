import java.util.Scanner;

public class Example02
{
	//도서 대여관리 프로그램 V0.2
	public static void main(String[] args)
	{
		Library lib = new Library();
		Scanner sc = new Scanner(System.in);
		int menuno, bookno;
		
		do
		{
			lib.PrintMenu();
			
			System.out.print("메뉴: ");
			menuno = sc.nextInt();
			
			System.out.println("선택한 메뉴는 "+menuno+"입니다.");
			
			if(menuno==1)		 //도서 목록 
			{
				lib.PrintList();
			} else if(menuno==2) //도서 대출
			{
				System.out.println("****************");
				System.out.println("대출하실 도서 번호를 입력하세요.");
				
				System.out.print("도서번호: ");
				bookno = sc.nextInt();
				
				lib.Rent(bookno);
				//lib.Process(bookno, menuno);
				lib.PrintList(bookno);
			} else if(menuno==3) //도서 반납
			{
				System.out.println("****************");
				System.out.println("반납하실 도서 번호를 입력하세요.");
				
				System.out.print("도서번호: ");
				bookno = sc.nextInt();
				
				lib.Return(bookno);
				//lib.Process(bookno, menuno);
				lib.PrintList(bookno);
			} else if(menuno==4) //종료
			{
				break;
			} else				 //입력 오류
			{
				System.out.println("메뉴 번호를 다시 확인 해주세요.");
				System.out.println("--------------------------");
			}
		} while(true);

		System.out.println("============================");
		System.out.println("프로그램이 종료되었습니다.");
	}
}