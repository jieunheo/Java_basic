package ezen;

public class Server
{	
	//��ø Ŭ���� ����
	
	Client myClient;
	
	Server() {
		myClient = new Client();
		myClient.nickName = "�׽���";
	}
	
	public static void main(String[] args)
	{
		Server s = new Server();
		s.Print();
	}
	
	void Print() {
		System.out.println(myClient.nickName);
	}
	
	
	public class Client
	{
		public String nickName; //�г���
	}
}