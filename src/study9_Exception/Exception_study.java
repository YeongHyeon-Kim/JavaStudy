package study9_Exception;

/*
 * 예외 클래스의 최상위 클래스는 Throwalbe 클래스로 하위에 Error Exception이 있다.
 * Error 의 대표적인 예로 JVM 에러로 일반 어플리케이션에서는 예외처리를 할수 없다.
 * 
 * Exception의 종류
 * 1. compile unchecked Exception 계열
 * 	  컴파일시에 예외처리 여부를 검사하지 않는 클래스 계열
 * 	  runtimeException 클래스 계열에 해당
 *	  이런 경우에는 보통 개발자의 부주의로 생기는 거스로 값을 0으로 나누거나 null값을 가지고 메서드를 호출할때 등
 *    코드를 이용한 검증방법 if문을 이용하여 충분히 예외발생을 제거할수 있다.
 *    ex) ArithmeticException : 0으로 나누는 경우 if문으로 나누는 수가 0인지 체
 *    	  NullPointerException : null값을 가진 참조 변수로 객체 멤버 접근시에 발생 null인지 체크
 *        ArrayIndexOutOfBoundsException : 배열의 index 넘어간 경우 / 배열의 길이 먼저 체크하기
 *        ClassCastException : 형변환 연산자 사용시 타입이 일치하지 않는 경우 발생 instanceof 연산자 활용하여 체크
 *        
 * 2. compile checked Exception 계열
 *    컴파일시에 예외처리 여부를 검사하는 클래스 계열 / 예외처리 코드 구현하지 않으면 컴파일시에 에러가 발생
 *    IOException / SQLException 클래스 해당
 *    
 * 예외처리 방법
 * #1
 * 1. try~catch~finally 문을 이용한 직접 처리
 * catch(e.printStackTrace()); 를 이용하여 발생된 예외정보를 출력할수 있다.
 * 예외가 발생하기까지의 모든 과정과 예외코드 라인번호를 출력함
 * 아니면 print(e.getMessage()); 는 간단한 예외정보 출력
 * 
 * 다중 catch 구문에서는 상위 catch 구문에 예의클래스 상속구조에서 하위 클래스 먼저 확인해야한다.
 * 아니면 첫번째 catch 에서 모든 예외를 다 받아가버리기 때문에
 * 전체를 Exception e 로 catch 할수는 있지만 두루뭉실하게 하는것보다 다중 catch구문을 사용하는 것을 권장한다.
 * 보통 맨 마지막 catch에 Exception e구문을 사용하여 처리한다.
 * 
 * 
 * #2
 * 2. throws 키워드를 이용한 위임 처리
 * 예외가 발생하는 기본 단위는 메서드
 * 메서드를 호출하고 호출된 메서드가 실행되면서 예외가 발생 -> 예외가 발생하는 곳에서 보통 예외 처리
 * -> 호출한 곳으로 예외처리를 위힘하는 것이 throw -> 계속 위임하다 보면 main 함수까지 오게되니까
 * main에서 try~catch로 예외처리를 할수 잇음. 만약 main에서 예외처리를 하지 않으면 프로그램이 비정상 종료된다.
 * 
 * 메서드 오버라이딩시 주의 사항
 * void c() throws AritmeticException{}
 * 
 * @Override
 * public void c() throws Exception{} -> 오버라이딩 한 메서드의 예외 클래스가 상위 클래스의 예외클래스보다 상위이면 오류
 * 
 * 명시적으로 예외를 발생시킬수도 있다 #3
 */
public class Exception_study {

	public static void main(String[] args) {
		//#1
		try {
			int value = 0;
			int num = 15/value;
			int result = num + 100;
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("반드시 수행되는 문장");
			//예외발생 여부에 상관없이 반드시 실행된다.
			
			//더 나아가서 try~finally문장만으로도 사용 가능한데
			//이럴때는 예외처리 목적이 아니라 반드시 수행되어야 하는 문장임을 알리는 목적으로 사용된다.
			
		}
		System.out.println("try~catch~finally 이후에 실행되는 문장");
		
		
		
		
		
		
		//#2
		System.out.println("프로그램 시작");
		try {
			a();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//#3
		try {
			check(70);
		} catch(Exception e) {
			System.out.println(e.getMessage()); //"num이 100보다 작다" 출력
		}
		
	}
	
	//#2
	public static void a() throws ArithmeticException, NullPointerException{
		b();
	}
	public static void b() throws ArithmeticException, NullPointerException{
		int num = 3/0;
		String name = null;
		System.out.println(name.length());
	}
	
	//#3
	public static void check(int num) throws Exception{
		if (num <100) {
			throw new Exception("num이 100보다 작다");
		}
	}
}
