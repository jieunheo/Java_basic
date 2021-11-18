package ezen;

public class Server
{	
	//중첩 클래스 예제
	
	Client myClient;
	
	Server() {
		myClient = new Client();
		myClient.nickName = "테스터";
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
		public String nickName; //닉네임
	}
}