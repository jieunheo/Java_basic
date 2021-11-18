public class Student 
{
	//클래스(양식,설계서)이름: Student
	//데이터의 구조(이름, 지역, 성별, 점수)
	String	name;	//이름
	String	area;	//지역
	String	gender;	//성별
	int		score;	//점수
	
	//생성자
	Student( String name, String area, String gender, int score )
	{
		this.name = name;
		this.area = area;
		this.gender = gender;
		this.score = score;
	}
	
	//메소드
	void PrintInfo()
	{
		System.out.println("이름: " + this.name);
		System.out.println("지역: " + this.area);
		System.out.println("성별: " + this.gender);
		System.out.println("점수: " + this.score);
	}
}