//���� ���� ���� Ŭ����
public class Library 
{
	private int		bookno; //å��ȣ
	private Book[]	books = null;
	
	//������
	Library() {
		bookno = 1; //�ʱ�ȭ
		books = new Book[3];
		
		books[0] = new Book(bookno++,"�̰��� �ڹٴ�. 1��","ȫ�浿",2);
		books[1] = new Book(bookno++,"�̰��� �ڹٴ�. 2��","ȫ�浿",2);
		books[2] = new Book(bookno++,"�̰��� �ڹٴ�. 3��","ȫ�浿",2);
	}
	
	//�޴� ��� �޼ҵ�
	void PrintMenu()
	{
		System.out.println("���� �뿩���� ���α׷� V0.2");
		System.out.println("============================");
		System.out.println("1. ������� ��ȸ");
		System.out.println("2. ��������");
		System.out.println("3. ����ݳ�");
		System.out.println("4. ���α׷� ����");
	}
	
	//���� ��� ��� �޼ҵ�
	void PrintList()
	{
		System.out.println("****************");
		for(int i=0; i<books.length; i++)
		{
			books[i].PrintInfo();
			System.out.println("****************");
		}
	}
	
	//�ش� ���� ��� ��� �޼ҵ�
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
	
	//���� �뿩 �޼ҵ�
	void Rent(int bookno)
	{
		for(int i=0; i<books.length; i++)
		{
			if(bookno==books[i].getNo())
			{
				//books[i].DoRent(1);
				if(books[i].DoRent(1)==true) //books[i].DoRent(1) ���� �� ������� ����
				{
					System.out.println("===> ���� �Ϸ�");
				} else
				{
					System.out.println("===> ���� ����");
				}
				System.out.println("****************");
				break;
			}
		}
	}
	
	//���� �ݳ� �޼ҵ�
	void Return(int bookno)
	{
		for(int i=0; i<books.length; i++)
		{
			if(bookno==books[i].getNo())
			{
				if(books[i].DoReturn(1)==true) //books[i].DoReturn(1) ���� �� ������� ����
				{
					System.out.println("===> �ݳ� �Ϸ�");
				} else
				{
					System.out.println("===> �ݳ� ����");
				}
				System.out.println("****************");
				break;
			}
		}
	}
	
	//���ο� ���� �߰�
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
	
	//���� �뿩 �޼ҵ�
	void Rent2(int i)
	{
		if(books[i].DoRent(1)==true) //books[i].DoRent(1) ���� �� ������� ����
		{
			System.out.println("===> ���� �Ϸ�");
		} else
		{
			System.out.println("===> ���� ����");
		}
		System.out.println("****************");
	}
	
	//���� �ݳ� �޼ҵ�
	void Return2(int i)
	{
		if(books[i].DoReturn(1)==true) //books[i].DoReturn(1) ���� �� ������� ����
		{
			System.out.println("===> �ݳ� �Ϸ�");
		} else
		{
			System.out.println("===> �ݳ� ����");
		}
		System.out.println("****************");
	}
	*/
	
}