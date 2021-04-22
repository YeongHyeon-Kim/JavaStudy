package study8;

import java.util.StringTokenizer;

public class StringTokenizerAPI_study {
/*
 * 문자열을 특정 구분자로 분리할수 있는 클래스 String의 split과 비슷한 기능 제공
 * 기본 구분자는 공백
 * 
 */
	public static void main(String[] args) {
		String message = "홍길동,김영현,이순신";
		
		StringTokenizer st = new StringTokenizer(message, ",");
		while(st.hasMoreElements()) { // 남아있는 토큰이 있는지 여부를 boolean 값으로 반환
			String token = st.nextToken(); // 다음 토큰 문자열로 반
			System.out.println(token);
			System.out.println(st.countTokens()); //사용하지않고 남아있는 토큰의 개수 반환
		}
	}

}
