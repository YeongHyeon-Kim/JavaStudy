package Study1_5;

import java.util.Calendar;

public class Singleton {
	private static Singleton s = new Singleton();
	//한번은 생성해야 되기때문에 자신의 클래스에서 미리 만들어두고 static을 이용하여 프로그램 실행시 단 한번 생성
	
	private Singleton() {}
	//외부에서 접근할수 없도록 private으로 지
	
	public static Singleton getSingleton() {
		return s;
	}
	
	public String getName() {
		return "싱글톤 기법";
	}
	
	
	public static void main(String[] args) {
		

	}

}
/*
  사용예시
 */
class ex{
	Singleton ss = Singleton.getSingleton();
	//특정 클래스의 참조값을 얻을때 new 클래스()형태가 아니라 위와 같은 형태라 하면
	//싱글톤 디자인패턴을 이용했다고 간주할수 있음.
	//대표적인 예시 Calendar
	Calendar cal = Calendar.getInstance();
	
	String name = ss.getName();
	
}
