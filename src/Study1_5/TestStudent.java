package Study1_5;

public class TestStudent {

	public static void change(int num) { num = 20; }
	
	
	public static void main(String[] args) {
		Student stu = new Student("김영",10);
		//1. Student stu 실행,  stu가 스택 메모리에 저장
		//2. new Student 실행,  힙메모리에 Student 클래스가 객체생되어 구성요소(인스턴스변수, 메서드)가 저장됨
		//3. Student("김영현", 10) 실행, 생성자를 호출, 2에서 생성되었던 인스턴스 변수에 각 값이 들어가서 저장
		//4. = 연삱다 실행되면서 힙 메모리에 생성되었던 인스턴스의 위치정보값을 stu에 할당함.
		stu.name ="김영현";
		stu.setName("김영현");
		
		stu.age = 25;
		
		String n = stu.name;
	
		
		/*
		 * 메서드 인자를 전달할때 변수를 전달하면(기본 데이터형) 실제값이 전달되고 새로운 복사본이 생김
		 * 즉 저장된 변수값은 변하지 않음 
		 */
		int num = 10;
		System.out.println("변경 전"+num);
		change(num);
		System.out.println("변경 후"+num); //차이가 없다.
		
		
		/*
		 * 메서드 인자로 참조 데이터형을 전달할때는 실제값이 전달된즌게 아니라
		 * 저장된 인스턴스를 참조하는 주소값이 전달된다.
		 * 즉 인스턴스 값을 변경 시키면 다른곳에서도 변경된다.
		 */
		Book book = new Book("원래책",10);
		System.out.println(book.getInfo());
		changeBook(book);
		System.out.println(book.getInfo()); //기본 데이터형을 넣었을때와는 다르게 값이 변경되어서 출력됨
	}
	public static void changeBook(Book book) {
		book.title = "바뀐 책";
		book.price = 100;
	}

}
/*
 * 여기서는 위에 메서드 인자에 참조데이터형을 전달할때를 위해 만든거지 실제 개발에서는
 * 절대 이런식으로 코드를 짜서는 안됨
 * public class book으로 적으면 오류가
 */
class Book{
	String title;
	int price;
	
	/*예제 2번*/
	public Book(String title) {
		this(title, 50); //string과 int 파라미터를 가진 생성자 호출.
	}
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	public String getInfo() {
		return title + "\t" + price;
	}
	
}
/*
this
객체 생성후에 힙 메모리에 생성된 자기 자신의 인스턴스를 의미한다.
즉 자기 자신을 가리킬때 사용가능하다.
위에 예시를 보자면 객체 생성될때 title price를 받는데
이 들어온 값들을 객체 생성된거의 title과 price값으로 한다. 라는 의미가 된다.

일반적으로 생략이 가능하지만 반드시 사용해야 하는 경우가 있다.
1. 인스턴스 변수와 로컬변수명이 동일한 경우
this를 생략하면 로컬 변수명으로 받아들인다. 위의 예시의 경우이다.

2. 생성자에서 다른 오버로딩 생성자를 불러올때 위의 예시 2번을 봐보자
*/





