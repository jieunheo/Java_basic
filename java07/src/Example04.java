public class Example04 
{
	public static void main(String[] args) 
	{
		Library lib = new Library();
		Book b;
		b = lib.GetNewBook(10, "���α׷��� ����", "�ڱ浿", 10);
		b.PrintInfo();
	}
}
