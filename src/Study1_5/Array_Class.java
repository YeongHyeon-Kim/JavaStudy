package Study1_5;

import java.util.Arrays;


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
		
		/*
		 * Array API를 이용하여 정렬, 최대값, 최소값, 배열 복사, 특정값으로 채우기 등등 하
		 */
		
		//배열복사
		String [] str = {"홍길동","김영현","이순신"};
		String [] str2 = Arrays.copyOf(str, str.length);
		
		//특정값으로 전체 채우기
		int [] nums = {1,2,3};
		Arrays.fill(nums, 100); //이미 차있는 배열 전부를 특정값으로 바꿈
		//일부분만 채우기
		String [] fruits = {"사과","배","딸기"};
		Arrays.fill(fruits, 0,2,"바나나"); //시작과 끝 지정해서 일부분만 바꿀수도 있음
		
		//배열 비교하기
		String [] p = {"홍길동","김영현","이순신"};
		String [] p2 = {"홍길동","김영현","이순신"};
		System.out.println(Arrays.equals(p, p2)); //true 출력
		
		//sort하기
		//기본은 오름차순이고 comparator인터페이스 이용하여 사용자 클래스도 정렬 가능
		int [] num = {22,1,4,2,7,20};
		Arrays.sort(num);
		
//		comparator인터페이스 이용 부분은 7장의 Comparator_interface_sort_study부분을 다시 봐보자
	
		
		//인덱스 찾기
		String [] s = {"홍길동","김영현","이순신"};
		int index = Arrays.binarySearch(s, "이순신"); //특정 배열 요소의 인덱스 반환
		
	}

}
