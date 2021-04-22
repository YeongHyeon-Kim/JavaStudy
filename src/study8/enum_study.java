package study8;


/*
 *enum = 열거형 상수
 *데이터가 몇개의 한정된 상수값으로 구성될때 사용한다.
 *생성방법
 * public enum 열거데이터형{ 상수값1, 상수값2, 상수값3};
 * public enum Colors {RED, BLACK, YELLOW}
 */
public class enum_study {
	public enum Colors {RED, BLACK, YELLOW};
	
	public static void main(String[] args) {
		Colors color = Colors.BLACK;
		
		Colors [] c = Colors.values(); //enum 상수값을 배열로 반환
		
		for (Colors x : c) {
			System.out.println(x.name()+ x.ordinal());
			//.name() = 상수의 이름을  String으로 변환, ordinal = 0부터 시작하는 enum 상수의 인덱스값 반
		}
	}

}
