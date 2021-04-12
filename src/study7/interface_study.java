package study7;
/*
 * 인터페이스
 * 포함 가능한 구성요소
 * public static final 지정한 상수
 * public abstract 이용한 추상 메서드
 * public default 지정자를 이용한 일반메서드
 * public static을 사용한 일반 메서드
 * 
 * 구현할때 extends가 아니라 implements를 사용함
 * 
 * 함수의 껍데기만 있는데 함수의 구현을 강제
 * 블록이 없는 즉 추상메서드이지만 abstract 생략가능 하지만 보통 생략 안
 * 
 */

interface Flyer{
	public abstract void takeOff();
	public abstract void fly();
	public void land(); //abstract 생략을 할 수있음 
}
class Bird implements Flyer{

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}
	
}

class Airplane implements Flyer{

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}
	
}

public class interface_study {

	public static void main(String[] args) {
		Bird b = new Bird();
		b.fly();
		b.land();
		
		Flyer flyer = new Airplane();
		flyer.fly();
		
		
		Car c = new Car();
		c.start();
		c.speed();
		Vehicle.stop(); //static으로 선언했기 때문에 생성자로 안해도 사용가능
		
	}

}

/*
 * default 메서드와 static 메서드 사용하
 */

interface Vehicle{
	public abstract void speed();
	public default void start() {
		System.out.println("start~");
	}
	public static void stop() {
		System.out.println("stop~");
	}
	
}
class Car implements Vehicle{
	@Override
	public void speed() {
		System.out.println("100km");
	}
}