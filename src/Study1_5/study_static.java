package Study1_5;

import static java.lang.Math.PI;
//주로 안드로이드에서 많이 사용되는 기법. 가독성이 떨어져서 잘 사용하지는 않음.

class Count {
	static int count;
	int num;
	public Count() {
		count++;
		num = count;
	}
	public int getNum() {return num;}
	public static int getNum2() {
		//return num; num 이 스태틱이 아니 오류
		return count;
	}
}

public class study_static {
	
	public static void main(String[] args) {
			System.out.println(Count.count);//static변수 가져오려면 클래스명.변수명 이런식으로 가져와서 사용가능하다.
			Count c1 = new Count();
			System.out.println(c1.getNum());
			Count c2 = new Count();
			System.out.println(c2.getNum());
			System.out.println(Count.count);
			
			System.out.println(Math.PI);
			System.out.println(PI); // static으로 import했기 때문에 위와 같이 쓰지 않아도 바로 사용할수 있다.
	}

	public study_static() {
		System.out.println("생성자");
	}
	//new 실행시 호출
	
	static {
		System.out.println("static 블록은 프로그램 실시 바로 실행");
	}
	{
		System.out.println("instance 블록은 객체 생성시 실행");
	}
	//객체 생성시 만들어 지기 때문에 new 전에 불러와짐. 그래서 먼저 출력됨
	
	
}
