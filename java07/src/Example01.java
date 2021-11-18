import java.util.Scanner;

public class Example01 
{
	//도서 대여관리 프로그램 V0.1
	public static void main(String[] args) 
	{
		Book[] books = null;
		books = new Book[3];
		books[0] = new Book(1,"이것이 자바다. 1권","홍길동",2);
		books[1] = new Book(2,"이것이 자바다. 2권","홍길동",2);
		books[2] = new Book(3,"이것이 자바다. 3권","홍길동",2);
		
		Scanner sc = new Scanner(System.in);
		
		int menuno, bookno;
		boolean isContinue = true;
		
		do
		{
			System.out.println("도서 대여관리 프로그램 V0.1");
			System.out.println("============================");
			System.out.println("1. 도서목록 조회");
			System.out.println("2. 도서대출");
			System.out.println("3. 대출반납");
			System.out.println("4. 프로그램 종료");
			
			System.out.print("메뉴: ");
			menuno = sc.nextInt();
			
			System.out.println("선택한 메뉴는 "+menuno+"입니다.");
			
			switch(menuno)
			{
			case 1: //도서 목록 출력
				System.out.println("****************");
				for(int i=0; i<books.length; i++)
				{
					books[i].PrintInfo();
					System.out.println("****************");
				}
				break;
			case 2: //도서 대출
				System.out.println("****************");
				System.out.println("대출하실 도서 번호를 입력하세요.");
				
				System.out.print("도서번호: ");
				bookno = sc.nextInt();
				
				for(int i=0; i<books.length; i++)
				{
					if(bookno==books[i].getNo())
					{
						//books[i].DoRent(1);
						if(books[i].DoRent(1)==true) //books[i].DoRent(1) 실행 후 결과값이 나옴
						{
							System.out.println("===> 대출 완료");
						} else
						{
							System.out.println("===> 대출 실패");
						}
						System.out.println("****************");
						break;
					}
				}
				break;
			case 3: //도서 반납
				System.out.println("****************");
				System.out.println("반납하실 도서 번호를 입력하세요.");
				
				System.out.print("도서번호: ");
				bookno = sc.nextInt();
				
				for(int i=0; i<books.length; i++)
				{
					if(bookno==books[i].getNo())
					{
						if(books[i].DoReturn(1)==true) //books[i].DoReturn(1) 실행 후 결과값이 나옴
						{
							System.out.println("===> 반납 완료");
						} else
						{
							System.out.println("===> 반납 실패");
						}
						System.out.println("****************");
						break;
					}
				}
				
				break;
			case 4: 
				isContinue = false;
				break;
			default:
				System.out.println("메뉴 번호를 다시 확인 해주세요.");
				System.out.println("--------------------------");
				break;
			}
		} while(isContinue);

		System.out.println("============================");
		System.out.println("프로그램이 종료되었습니다.");
	}
}