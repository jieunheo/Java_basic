public class Example04 
{
	//학생들의 총점,평균 구하기 Version 0.4
	public static void main(String[] args) 
	{
		//홍길동-70 (전주)
		//김길동-90 (군산)
		//성춘향-100 (익산)
		//이몽룡-60 (완주)
		//김춘자-100 (전주)
		//이순신-77 (서울)
		//데이터의 구조(이름,지역,점수,성별)
		
		Student[] s = null;
		s = new Student[6];
		s[0] = new Student("홍길동","전주","남",70);
		s[1] = new Student("김길동","군산","남",90);
		s[2] = new Student("성춘향","익산","여",100);
		s[3] = new Student("이몽룡","완주","남",60);
		s[4] = new Student("김춘자","전주","여",100);
		s[5] = new Student("이순신","서울","남",77);

		/*
		int sum = 0, avg = 0;
		Student x = null;
		for(int i=0; i<s.length; i++)
		{
			//System.out.println(s[i].name+"은 "+s[i].score+"점");
			x = s[i];
			x.PrintInfo();
			sum += s[i].score; //sum += x.score;
		}
		avg = sum/s.length;
		System.out.println("=============================");
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		*/

		//향상된 for문
		for(Student x:s)
		{
			x.PrintInfo();
		}
	}
}