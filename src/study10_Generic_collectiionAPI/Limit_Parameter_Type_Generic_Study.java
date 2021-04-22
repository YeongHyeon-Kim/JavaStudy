package study10_Generic_collectiionAPI;

/*
 * public class Class_Name <T extends 타입>
 * 설정 가능한 타입은 해당 타입과 그 자식의 클래스로 한정된다.
 */

class Pet{}
class Cat extends Pet{}
class Dog extends Pet{}

class Box3 <T extends Pet> {
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}


public class Limit_Parameter_Type_Generic_Study{

	public static void main(String[] args) {
		Box3<Pet> b = new Box3<Pet>();
		Box3<Dog> b2 = new Box3<Dog>();
		Box3<Cat> b3 = new Box3<Cat>();
		//Pet으로 제한해두었기 때문에 Pet과 자식클래스 Cat, Dog만 사용가능하다.
		
		//Box3<Object> b4 = new Box3<Object>();
		//Object 클래스는 모든 클래스의 상위 클래스 이므로 컴파일 에러가 발생한다.
		

	}

}
