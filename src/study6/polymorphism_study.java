package study6;
/*
 * 다형성
 * 상속 관계의 계층구조에서 상위 타입의 변수로 모든 하위타입을 참조할수 있는 특성
 * ex) int --> long로 자동 변환 할수 있음
 * 
 * 보통 부모타입 = 자식 타입 형식으로 사용됨
 * 자식 타입 = 부모타입 형식으로 사용하기 위해서는 강제 형변환 시켜야함
 * instanceof 를 이용하면 타입이 무엇인지 확인할 수 있다.
 */
//
//class Employee{
//	String name;
//	int salary;
//	public String getEmployee() {
//		return name + " " + salary;
//	}
//	public Employee() {}
//	public Employee(String name, int salary) {
//		this.name = name;
//		this.salary = salary;
//	}
//}
//
//class Manager extends Employee{
//	String depart;
//	@Override
//	public String getEmployee() {
//		return super.getEmployee() + depart;
//	}
//	public Manager(String name, int salary, String depart) {
//		super(name, salary);
//		this.depart = depart;
//	}
//	
//}
//
//public class polymorphism_study {
//
//	public static void main(String[] args) {
//		Employee e = new Employee("김영현",10000);
//		System.out.println(e.getEmployee());
//		
//		e = new Manager("김영현",1000,"개발");
//		System.out.println(e.getEmployee());
//		//동적 바인딩이라함
//		//컴파일 시점에서는 상위 객체의 메서드로 인식하지만 실행 시점에서는 실제 객체 생성한 하위 객체의 메서드가 실행
//		//중요! 메서드에서만 동적 바인딩이 일어나고 부모와 자식에 모두 동일한 변수가 있다면 
//		//컴파일과 실행 구별하지 않고 모두 부모타입의 변수로 인식함.
//	}
//
//}
