package Study1_5;

class Cat{
	String name;
	public Cat(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}


public class Array_Class {

	public static void main(String[] args) {
		/*
		 * 배열로 클래스 관리하
		 */
		
		//new 방법 사
		Cat [] cats = new Cat[3];
		cats[0] = new Cat("나비");
		cats[1] = new Cat("냐옹");		
		
		
		//리터럴 사용
		Cat [] cats2 = { new Cat("나비"),
				new Cat("냐오옹")
		};
		
		//new+리터럴 사용하기
		
		Cat [] cats3 = new Cat[] {
				new Cat("나비")
		};
		
	}

}
