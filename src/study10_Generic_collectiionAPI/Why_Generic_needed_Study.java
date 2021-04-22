package study10_Generic_collectiionAPI;

public class Why_Generic_needed_Study {
	/*
	 * 컴파일 시점에서 사용하는 데이터형을 체크하기 때문에 프로그램의 안전성을 향상시키거나
	 * 데이터 사용시 데이터형을 체크하지 않기 때문에 코드 사용도 간편하다는 장점을 가짐
	 */
	public static void main(String[] args) {
		
		//필요한 이유
		Object [] arr = {"김영현","자바공부",100};
		for (Object obj : arr) {
			String name = (String)obj;
			//강제 형변환을 해주는데 컴파일 시점에서는 100이라는 int형태가 있는지 인지하지 못해서 실행시 오류가 난다.
			System.out.println(name);
		}
		
		Object [] arr2 = {"김영현","자바공부",100};
		for (Object obj : arr) {
			if (obj instanceof String) {
				//그래서 instanceof 를 사용해야한다는 불편함이 있다. 이를 generic으로 해결할수 있다.
				String name = (String)obj;
				System.out.println(name);
			}
		}
		
		
		
		
	}

}