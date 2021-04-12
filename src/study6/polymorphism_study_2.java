package study6;
//
//class Employee{
//	public void taxRate(Employee e) {
//		if ( e instanceof Manager) { // if문 안에 만약에 상위 객체인 employee부터 비교하면 처음 if문에서 더이상 내려가지 않음
//			Manager m = (Manager)e;
//			System.out.println("manager");
//		}
//		else if( e instanceof Engineer) {
//			Engineer en = (Engineer)e;
//			System.out.println("Engineer");
//	}	else if( e instanceof Employee) {
//			System.out.println("Emplyee");
//	}
//		
//}
//}
///*
// * 상위 객체에서 모두다 만들어버렸기 때문에 만약 수정사항이 생기더라도
// * 일일이 하위 객체를 찾거나 하지 않아도 된다.
// */
//class Manager extends Employee{}
//class Engineer extends Employee{}
//
public class polymorphism_study_2 {}
//
//	public static void main(String[] args) {
//		Employee emp = new Employee();
//		Manager man = new Manager();
//		Engineer eng = new Engineer();
//		
//		emp.taxRate(emp);
//		man.taxRate(man);
//		eng.taxRate(eng);
//	}
//}
