package study8;

public class Wrapper_Study {

	public static void main(String[] args) {
		byte b = Byte.MIN_VALUE;
		int i = Integer.MIN_VALUE;
		int i_max = Integer.MAX_VALUE;
		//이런방식으로 확인가능하니까 굳이 외우고 있을필요 없음
		/*
		 * 주요 메서
		 */
		String str = "123";
		int a = Integer.parseInt(str);
		
		int num = 10;
		Integer x = new Integer(num);
		int x2 = x.intValue();
		
		Integer x3 = num;
		//오토박싱
		
		int x4 = x3;
		//언박싱 이렇게 굳이 위에처럼 객체 생성하지 않아도 바로 가능하다.
		
		Object [] obj = {10, "홍길", 3.14,true, 'A'};
		//오토박싱으로 원래 오브젝트는 참조형 데티터밖에 안되지만 기본형 데이터에도 문에없이 실행됨.
		
	}

}
