//도서 대출 관리 클래스
public class Library 
{
	private int		bookno; //책번호
	private Book[]	books = null;
	
	//생성자
	Library() {
		bookno = 1; //초기화
		books = new Book[3];
		
		books[0] = new Book(bookno++,"이것이 자바다. 1권","홍길동",2);
		books[1] = new Book(bookno++,"이것이 자바다. 2권","홍길동",2);
		books[2] = new Book(bookno++,"이것이 자바다. 3권","홍길동",2);
	}
	
	//메뉴 출력 메소드
	void PrintMenu()
	{
		System.out.println("도서 대여관리 프로그램 V0.2");
		System.out.println("============================");
		System.out.println("1. 도서목록 조회");
		System.out.println("2. 도서대출");
		System.out.println("3. 대출반납");
		System.out.println("4. 프로그램 종료");
	}
	
	//도서 목록 출력 메소드
	void PrintList()
	{
		System.out.println("****************");
		for(int i=0; i<books.length; i++)
		{
			books[i].PrintInfo();
			System.out.println("****************");
		}
	}
	
	//해당 도서 목록 출력 메소드
	void PrintList(int bookno)
	{
		System.out.println("****************");
		for(int i=0; i<books.length; i++)
		{
			if(bookno==books[i].getNo())
			{
				books[i].PrintInfo();
				System.out.println("****************");
			}
		}
	}
	
	//도서 대여 메소드
	void Rent(int bookno)
	{
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
	}
	
	//도서 반납 메소드
	void Return(int bookno)
	{
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
	}
	
	//새로운 도서 추가
	Book GetNewBook(int no, String title, String author, int have) 
	{
		Book book = new Book(no, title, author, have);
		
		return book;
	}
	
	
	
	
	
	
	
	
	/*
	void Process(int bookno, int menuno)
	{
		for(int i=0; i<books.length; i++)
		{
			if(bookno==books[i].getNo())
			{
				if(menuno==2) {
					Rent2(i);
				} else
				{
					Return2(i);
				}
			}
		}
	}
	
	//도서 대여 메소드
	void Rent2(int i)
	{
		if(books[i].DoRent(1)==true) //books[i].DoRent(1) 실행 후 결과값이 나옴
		{
			System.out.println("===> 대출 완료");
		} else
		{
			System.out.println("===> 대출 실패");
		}
		System.out.println("****************");
	}
	
	//도서 반납 메소드
	void Return2(int i)
	{
		if(books[i].DoReturn(1)==true) //books[i].DoReturn(1) 실행 후 결과값이 나옴
		{
			System.out.println("===> 반납 완료");
		} else
		{
			System.out.println("===> 반납 실패");
		}
		System.out.println("****************");
	}
	*/
	
}