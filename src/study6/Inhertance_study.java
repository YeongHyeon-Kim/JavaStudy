package study6;
/* 상속의 특징
 * is a 관계가 성립할 때 상속을 적용
 * 부모클래스의 멤버를 자식클래스가 선언 없이 사용가능
 * 자바는 단일 상속만 지원함.
 * 키워드는 extends
 * 
 * private으로 지정한 데이터는 상속되지 않는다.
 * 
 */
//class Employee{
//	String name;
//	int salary;
//	public String getEmployee() {
//		return name + salary;
//	}
//	
//	public Employee() {
//		System.out.println("Employee 생성자 1");
//	} //상속할때 필수로 적어주어야 함
//	/*
//	 * 부모 클래스의 생성자는 자식 클래스에 상속되지 않음.
//	 * 클래스를 객체 생성할때에는 자동으로 부모 클래슬르 먼저 객체 생성후에 자신의 클래스가 생성됨. 
//	 * 부모가 생성되어야 그 멤버를 자식으로 생성할 수 있기 때문에
//	 * 자식 클래스의 생성자 첫라인에서 부모 생성자의 호출이 자동으로 발생됨.
//	 */
//
//	public Employee(String name, int salary) {
//		this.name = name;
//		this.salary = salary;
//		System.out.println("Employee 생성자 2");
//	}
//}
//
//class Manager extends Employee{
//	String depart;
//	public String getManager() {
//		return name + depart + salary;
//		//상속을 받았기 때문에 바로 name과 salary 사용 가능 
//	}
//	public Manager(String name, int salary, String depart) {
//		super(name, salary); // 항상 첫라인에서 호출해야함.
//		this.name = name;
//		this.salary = salary;
//		this.depart = depart;
//		
//	}
//}
//
//public class Inhertance_study {
//	public static void main(String[] args) {
//		Employee emp = new Employee("김영현",1000000000);
//		Manager man = new Manager("홍길동", 10000,"판매");
//	}
//
//}

/*
 * 메서드 오버라이딩
 * 규칙
 * 상속이 전제 되어야함, 메서드 이름 동일, 리턴타입 반드시 동일, 메서드 인자 리스트 동일, 
 */


