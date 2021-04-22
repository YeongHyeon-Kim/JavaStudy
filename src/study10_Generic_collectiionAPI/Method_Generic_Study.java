package study10_Generic_collectiionAPI;

class Vehicle{}
class Truck extends Vehicle{}
class Car extends Vehicle{}


public class Method_Generic_Study {

	/*
	 * public <타입_파라미터> void 메서드명 (타입_파라미터 변수명){}
	 * public <타입_파라미터> 타입_파라미터 메서드명(타입_파라미터 변수명){
	 * 	return 타입_파라미터
	 * }
	 */
	
	public static <P> void method(P p) {}
	public static <P> P method2(P p) {
		return p;
	}
	
	public static void main(String[] args) {
		method(new Vehicle());
		method(new Truck());
		method(new Car());
		
		Vehicle v = method2(new Vehicle());
		Truck v2 = method2(new Truck());
		Car v3 = method2(new Car());

		
		
	}

	
}
