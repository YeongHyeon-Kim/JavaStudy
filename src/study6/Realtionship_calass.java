package study6;

public class Realtionship_calass {

	/*
	 * 클래스들의 관계
	 */
	
	/* 1. has a 관계
	 * 한 객체와 다른 객체가 포함관계인 경우
	 * 전체(whole ex, 자동차), 부분(part, ex, 엔진,핸들,바퀴) 자동차 has a 엔진이라고 표현할 수 있
	 * 1.1 집합관계(aggregation relationship
	 * whole과 part가 라이프사이클이 다른 경우
	 * 자동차 has a 라디오 / 하지만 라디오 객체가 없어도 자동차 객체는 독자적으로 존재할 수 있음.
	 * 
	 * 1.2 구성관계 (composition relationship)
	 * whole과 part가 라이프사이클이 같은 경우
	 * 자동차 has a 엔진 / 엔진 없이는 자동차 객체는 존재할 수 없음.
	 * 표현 방법
	 * class Car{
	 * Engine engine  이렇게 인스턴스 변수로 engine 클래스를 선언함으로써 has a 관계를 표현 가능하다.
	 * ...
	 * }
	 * class Engine{}
	 */
	
	/*
	 * is a 관계
	 * 비슷한 송석 및 동작을 가진 객체들간의 관계
	 * 대학생 is a 학생, 중학생 is a 학생
	 * 모두 공통된 속성 및 동작을 가지고 있으며 공통점들이 중복되어있다.
	 * 공통점을 추출해서 상위개념의 객체로 만들고,
	 * 하위 객체들에게상위 개념의 객채를 상속받아 사용하면
	 * 중복이 제거되고 재사용성도 향상된다.
	 * -> 상속 기법을 사용
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
