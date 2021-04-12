package study7;

/*
 * Nested class 중첩 클래스
 * 사용 목적 독립적인 일반 클래스로 생성할 필요는 없지만 나름대로 클래스 형식을 갖춰야 되는 경우
 * 예를 들어 A클래스가 있찌만 b클래스에서만 사용한다고 하면 b안에 a를 넣어서 작성하는게 관리하기 쉬워짐
 * 
 * 외부를 outer class 내부(중첩)를 inner클래스라고 부름
 * 장점
 * outer 클래스의 멤버를 자신의 멤버처럼 사용 가능 private일지라도 사용가능하다
 * static 변수를 선언 할 수없다. 단 static inner는 선언 가능함
 * inner의 접근은 반드시 outer 클래스를 통해서 접근할수 잇음
 * 
 * 종류 4가지
 * 1. memeber inner
 *  outer 클래스의 멤버변수나 메서드처럼 클래스가 정의된 경우
 *  외부에서 접근 방법
 *  Outer xx = new Outer();
 *  Outer.inner yy = xx.new Inner();
 *  
 * 2. local inner 
 *  outer 클래스의 특정 메서드 안의 로컬변수처럼 클래스가 정의된 경우
 * 3. static
 * 
 * Outer.Inner inner = new Outer.Inner();
 * 
 * 4. anonymous Inner 클래스 익명 클래스
 * 직접 클래스명을 지정하지 않으며 인스턴스 생성과 메서드 선언만을 정의함.
 * 익명클래스를 함수형 프로그래밍 기반으로 확장 표현한 것이 람다식이다.
 */

/*
 * 외부접근
 */

class Outer{
	int a = 10;
	private int b = 20;
	static int c = 30;
	
	class Inner{
		int d = 40;
		
		public void print() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}
	}
	public void info() {
		Inner inner = new Inner();
		inner.print();
	}
}

public class Nestedclass_Study {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.info();
		
		Outer.Inner inner = outer.new Inner();
		inner.print();
		
		
		
		Outer2 outer2 = new Outer2();
		outer2.info();
		
		
		Outer3.Inner inner3 = new Outer3.Inner();
		inner3.print();
		
		
		Flyer f = new Flyer() {

			@Override
			public void takeOff() {
			}
			@Override
			public void fly() {
			}
			@Override
			public void land() {
			}
		};
		f.fly(); //실제로 인터페이스는 new 할 수 없기 때문에 내부적으로 flyer를 구현한 익명의 클래스가 생성
	}
}
/*
 * local inner 클래스 메서드 안에 이너 클래스 선언해서 사용하
 */
class Outer2{
	int a = 10;
	private int b = 20;
	static int c = 30;
	
	public void info() {
		int size = 400;
		class Inner{
			int d = 40;
			public void print(){
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
		}
		Inner inner = new Inner();
		inner.print();
	}
}
/*
 * static inner 클래스 사용하
 */
class Outer3{
	int a = 10;
	private int b = 20;
	static int c = 30;
	
	static class Inner{
		static int d = 40;
		
		public void print() {
			//System.out.println(a);
			//System.out.println(b);
			//static inner 클래스에서는 static변수를 제외한 outer 클래스의 멤버변수에 접근할 수 없음.
			System.out.println(c);
			System.out.println(d);
		}
	}
	public void info() {
		Inner inner = new Inner();
		inner.print();
	}
}

/*
 * anonymous class 익명 클래
 */
interface Flyer2{
	public abstract void takeOff();
	public abstract void fly();
	public void land();
}