package study8;

/*
 * StringBuffer class 
 * String 클래슨느 불변성 특징을 같기 때문에 문자열 연산시 매우 비효율적이다.
 * StringBuffer는 thread-safe하지만 무거운 특징을 가지며
 * StringBuilder는 thread-unsafe하지만 성능이 좋은 특징이 있다.
 */
public class StringBuffer_study {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello");
		
		str.append(" World"); //string 과 다르게 새로운 문자열을 생성하는게 아니라 기존의 문자열에 추가하는것
		str.insert(5, "!!!"); //index 위치 5 문자열 삽입.
		str.delete(0, 5); //index 0부터 5전 즉 4까지의 문자열 삭제
		
		String data = str.toString(); //String 형태로 변환
		
		
	}

}
