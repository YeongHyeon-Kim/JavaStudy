package study8;

public class String_class_study {

	public static void main(String[] args) {
		String str = new String("Hello"); //같은 값이더라도 매번 새롭게 생성
		String str2 = "Hello"; //리터럴로 스트링을 만들때 동일한 값이 존재하면 새로 생성되지 않고 재사용함.
		//그래서 문자열을 비교할때 ==을 쓰면 안되고 equals를 사용해야 함
		//string은 한번 생성된 문자열은 변경되지 않는다는 불변성 특징을 가짐.
		//그래서 문자열이 자주 변경될때에는 stringBuffer 또는 stringBuilder 클래스를 사용하는 것을 권장
		
		String str3 = "Hello";
		String str4 = "Hello";
		
		System.out.println(str == str2); //false를 출력함
		
		/*
		 * 대표적인 메서드
		 */
		System.out.println(str.length()); //길이 반환
		
		System.out.println(str.equals(str2)); //문자열 일치하는지 검사
		
		System.out.println(str.equalsIgnoreCase(str2)); //대소문자 구별 없이 비교
		
		System.out.println(str.substring(2,4)); //인덱스가 2부터 4전까지인 문자열 출력
		
		System.out.println(str.replace('a', 'b')); //a문자열을 b로 바꿈
		
		System.out.println(str.toUpperCase()); //대문자로 바꿈
		
		System.out.println(str.toUpperCase()); //소문자로 바꿈

		System.out.println(str.charAt(3)); //index 3인 char 반환
		
		System.out.println(str.trim()); //공백 문자 제거
		
		System.out.println(str.concat("test"));
		
		System.out.println(str.indexOf("a")); //특정 문자열 위치 반환
		
		System.out.println(String.valueOf(123)); //문자열 아닌 값을 문자열로 반환
		
		System.out.println(str);//값을 출력해보면 위에서 어떤 메서드를 써도 원래값은 변하지 않는것을 볼 수 있다.
		
	}

}
