//���� ���� Ŭ����
public class Book 
{
	//�ʵ�
	private int		no;		//å��ȣ
	private String 	title;	//����
	private String 	author;	//����
	private int 	have;	//���尹��
	private int 	rent;	//���ⰹ��
	private int 	remain;	//�ܿ�����
	
	//������
	Book(int no, String title, String author, int have)
	{
		this.no		= no;
		this.title	= title;
		this.author	= author;
		this.have	= have;
		this.rent	= 0;
		this.remain	= have; //�ܿ� ������ ���� ������ �����ϰ� ó��
	}
	
	//���� ���� �޼ҵ�
	//���ϰ�: true-���⼺��, false-�������
	boolean DoRent(int count)
	{
		if (remain>=count) //�ܿ�����>=���ⰹ�� - ���Ⱑ��
		{
			rent += count;
			remain -= count;
			//System.out.println("���� �Ǿ����ϴ�. (���� ���� ����: "+remain+"/"+have+")");
			return true;
		} else 
		{
			//System.out.println("���� ������ ������ �����ϴ�.");
			return false;
		}
	}
	
	//���� �ݳ� �޼ҵ�
	//���ϰ�: true-�ݳ�����, false-�ݳ�����
	boolean DoReturn(int count)
	{
		if(rent>=count) //���ⰹ��>=�ݳ����� - �ݳ�����
		{
			rent -= count;
			remain += count;
			//System.out.println("�ݳ� �Ǿ����ϴ�. (���� ���� ����: "+remain+"/"+have+")");
			return true;
		} else
		{
			//System.out.println("�̰����� �������� ���� ������ �ֽ��ϴ�.");
			return false;
		}
	}
	
	//���� ���� ��� �޼ҵ�
	void PrintInfo()
	{
		System.out.println("å��ȣ: "+no);
		System.out.println("����: "+title);
		System.out.println("����: "+author);
		System.out.println("���尹��: "+have);
		System.out.println("���ⰹ��: "+rent);
		System.out.println("�ܿ�����: "+remain);
	}
	
	//getter
	int getNo()
	{
		return this.no;
	}
}