public class Saram 
{
	//필드(속성)
	private String	name;		//이름
	private int		age;		//나이
	private int		birthYear;	//생년
	
	//메소드 (세터/게터)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		this.birthYear = 2021 - age;
	}
	public int getBirthYear() {
		return birthYear;
	}
	
	
	public void Print()
	{
		System.out.println( "이름: " + this.name );
		System.out.println( "나이: " + this.age );
		System.out.println( "생년: " + this.birthYear );
	}
}