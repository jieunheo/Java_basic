//타이어 정보를 관리하는 클래스
public class Tire 
{
	private String	product;//제조사
	private int		inch;	//인치
	
	//생성자
	Tire()
	{
		product	= "금호타이어";
		inch	= 19;
		System.out.println( "자동 호출 되었습니다." );
	}
	//생성자 오버로딩
	Tire(String name)
	{
		this.product = name;
		inch = 18;
	}
	
	
	//메소드 (게터/세터)
	public String getProduct()
	{
		return product;
	}
	
	public void setProduct(String product)
	{
		this.product = product;
	}
	
	public int getInch()
	{
		return inch;
	}
	
	public void setInch(int inch) 
	{
		this.inch = inch;
	}
	
	//프린트 메소드
	public void Print() 
	{
		System.out.println( "제조사: " + this.product );
		System.out.println( "인치: " + this.inch );
	}
	
}