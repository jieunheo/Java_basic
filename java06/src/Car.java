//�ڵ��� ������ �����ϴ� Ŭ����
public class Car 
{
	int	speed;		//�ӵ�
	Tire frontLeft;	//�� ���� ����
	Tire frontRight;//�� ������ ����
	Tire rearLeft;	//�� ���� ����
	Tire rearRight;	//�� ������ ����
	
	//������
	Car()
	{
		System.out.println( "Car ������ ȣ�� �Ǿ����ϴ�." );
		
		speed		= 0;
		frontLeft	= new Tire();
		frontRight	= new Tire();
		rearLeft	= new Tire();
		rearRight	= new Tire();
	}
	
	//�ӵ� ��� �޼ҵ�
	void SpeedUp()
	{
		speed++;
		System.out.println( "speed up!: " + speed );
	}
	
	//�ӵ� �ϰ� �޼ҵ�
	void SpeedDown()
	{
		speed--;
		System.out.println( "speed doun!: " + speed );
	}
}