package study10_Generic_collectiionAPI;

class Group<T>{
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
class Person{}
class Man extends Person{}
class Woman extends Person{}


public class Limit_Method_Generic_Study {
	/* 타입 제한 하는방법
	 * 1. <?> 타입 제한이 없음 <? extends Objects>와 동일
	 * 2. <? extends T> T와 T를 상속받은 하위 클래스만 사용 가능
	 * 3. <? super T> T와 T의 부모클래스만 사용가능
	 * 
	 */
	
	
	public static void met(Group<?> group) {}
	public static void method3(Group<? extends Person> group) {}
	public static void method4(Group<? super Person> group) {}
	
	
	public static void main(String[] args) {
		//met 어떤 타입도 설정가능
		met(new Group<Object>());
		
		//method3 Person 또는 person 자식만 가
		// method3(new Group<Object>) object는 상위클래스이기 때문에 오류가 난다.
		
		//method4 Man, Woman 불가

	}

}
