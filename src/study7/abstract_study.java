package study7;

public class abstract_study {
/*
 * 추상 클래스
 * public abstract class 클래스명{
 * 인스턴스 변수
 * 일반 메서드
 * 생성자
 * 추상 메서드
 * 
 * }
 * 
 * 추상 메서드
 * public abstract 리턴타입 메서드명([파라미터]);
 * 
 */
	public static void main(String[] args) {
		MyClassImpl imp = new MyClassImpl();
		imp.print();
		imp.methodB();
	}
}

abstract class MyClass{
	int num = 3;
	public MyClass( ) {}
	public MyClass(int num) {
		this.num = num;
	}
	public void methodA(){
		System.out.println("methodA");
	}
	
	public abstract void methodB();
}

class MyClassImpl extends MyClass{
	public void print() {
		System.out.println(num);
	}
	
	@Override
	public void methodB() {
		System.out.println("methodB");
	}
}