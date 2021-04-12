package Study1_5;

public class overloading {
	/*
	 * 오버로딩은 원래라면 불가능한 같은 변수명, 같은 함수명이면 불가능하지만
	 * 매개변수를 다르게 하면(아예 다르거나 매개변수 순서를 바꾸거나) 각각 다르게 선언되기 때문에 같은 이름이라도 가능하다
	 * 대표적으로 println이 있고 생성자도 오버로딩으로 만들수 있다.
	 */
	public void sum() {}
	public void sum(String num, int a) {}
	/*
	 * 오버로딩 생성자를 사용할때는 기본 생성자가 자동으로 생성되지 않기때문에객체 생성시 에러발생을 최소화 하기위해서
	 * 기본 생성자는 명시적으로 생성해준다.
	 */
	public overloading() {}
	public overloading(int a) {}
	public overloading(int a, String asb) {}
	public static void main(String[] args) {
		

	}

}
