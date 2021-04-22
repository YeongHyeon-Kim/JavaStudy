package study9_Exception;

public class User_Define_Exception_Study {
	/*
	 * 시스템에서 제공하는 예외클래스 사용하는 것 외에 사용자 정의 예외클래스 사용하는 경우 2가지
	 * 
	 * #1
	 * 1. 사용자가 지정한 조건에 위배되는 경우에 사용
	 *    가. extends Exception을 사용한 클래스 작성
	 *    나. 문자열 인자를 가진 생성자 작성
	 *    다. 필요시 throw new UserException(mesg); 코드로 강제적으로 예외를 발생시켜서 사용함.
	 * 
	 * #2
	 * 2. 시스템의 예외 클래스를 사용자 예외클래스로 변환하는 경우에 사용
	 * 시스템에서 제되는 예외처리를 할경우 출력된 예외정보의 대부분이 사용자가 쉽게 이해할만한 내용이 아니여서
	 * 사용자 예외클래스로 변환시켜 쉽게 이해할수 있도록 처리 가능하다.   
	 */
	
	//#1
	public static void check(int num) throws UserException{
		if (num <100) {
			throw new UserException("num값이 100보다 작다");
		}
	}
	
	
	//#2
	public static void divide() throws ByZeroException{
		try {
			int num2 = 3/0;
			
		}catch (ArithmeticException e) {
			throw new ByZeroException("0으로 나누어 예외 발생함");
		}
		
	}
	

	public static void main(String[] args)  {
		//#1
		try {
			check(70);
		} catch(UserException e){
			System.out.println(e.getMessage());
		}
		
		
		//#2
		try {
			divide();
		} catch(ByZeroException e){
			System.out.println(e.getMessage());
		}
		
		
	
	}

}
//#1
class UserException extends Exception{
	public UserException(String mesg) {
		super(mesg);
	}
}


//#2
class ByZeroException extends Exception{
	public ByZeroException(String mesg) {
		super(mesg);
	}
}