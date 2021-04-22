package study10_Generic_collectiionAPI;

import java.util.Date;

public class Class_Generic_Study {
	/*
	 * 관례적인 예시
	 * public class Class_name<T> {}
	 * T = 참조 타입 지정시
	 * E = 요소 지정시
	 * k = map 계열의 key 지정시
	 * V = map 계열의 value 지정시
	 */
	public static void main(String[] args) {
		//generic을 쓰지 않은 경우
		Box b = new Box();
		b.setObj("Hello");
		String str = (String)b.getObj();
		System.out.println(str);
		
		Box b2 = new Box();
		b2.setObj(new Date());
		Date d = (Date)b2.getObj();
		System.out.println(d);
		
		
		
		Box2<String> b3 = new Box2<String>();
		b2.setObj("Hello");
		//b2.setObj(111);
		//String 으로 명시를 해주고 만들기 때문에 String 외의 값이 들어가면 컴파일 단계에서 오류 알림
		String str2 = b3.getObj();
		// 형변환을 따로 하지 않아도 된다.
		
		Box2<Date> b4 = new Box2<Date>();
		b4.setObj(new Date());
		Date d2 = b4.getObj();

		
	}

}
//generic을 쓰지 않은 경우
class Box{
	Object obj;


	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

//generic을 쓴경우
class Box2<T>{
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
