//자동차 정보를 관리하는 클래스
public class Car 
{
	int	speed;		//속도
	Tire frontLeft;	//앞 왼쪽 바퀴
	Tire frontRight;//앞 오른쪽 바퀴
	Tire rearLeft;	//뒤 왼쪽 바퀴
	Tire rearRight;	//뒤 오른쪽 바퀴
	
	//생성자
	Car()
	{
		System.out.println( "Car 생성자 호출 되었습니다." );
		
		speed		= 0;
		frontLeft	= new Tire();
		frontRight	= new Tire();
		rearLeft	= new Tire();
		rearRight	= new Tire();
	}
	
	//속도 상승 메소드
	void SpeedUp()
	{
		speed++;
		System.out.println( "speed up!: " + speed );
	}
	
	//속도 하강 메소드
	void SpeedDown()
	{
		speed--;
		System.out.println( "speed doun!: " + speed );
	}
}