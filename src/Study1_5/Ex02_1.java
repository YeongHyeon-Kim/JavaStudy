package Study1_5;

public class Ex02_1 {

	public static void main(String[] args) {
//		ONE:
//			for(int i=0; i<10; i++) {
//				for(int j=0; j<10; j++) {
//					continue ONE;
//				}
//			}
//		
		/* array */
		int [] testArray; //로컬변수여서 스택 메모리에 생성됨
		testArray = new int[10]; //힙메모리에 지정된 크기(10)만큼의 배열이 생성되고 정수형 초기값 0으로 저장 (string은 null값으로 저장)
		//스택 메모리에 저장된 변수 즉 참조변수로서 힙 메모리에 생성된 배열을 참조함
		testArray[0] = 1;
		testArray[1] = 2;
		System.out.println(testArray[0]);
		
		
		
		/*향상된 for 문 for-each문*/
		
		for(int i : testArray) {
			System.out.println(i);
		}
		
		
		
		
		/* 리터럴을 이용한 배열 생성 */
		
		//배열 생성과 동시에 초기화를 한번에 진행. 일반적으로 가장 많이 사용
		int [] num = {1,2,3,4,5}; // 저장될 데이터와 개수를 정확하게 알고 있는 경우에 사용
	
		//int [] num;
		//num = {12,3,4}; 리터럴 사용할때는 배열 선언이랑 값 할당을 따로 하면 에러가 발생함.
		
		int [] num2;
		num = new int[] {1,2,3,4}; // new를 사용해서 분리하여 사용할수는 있음. [] 안에 배열 크기 지정을 하면 오류
		
		
		
		
		/* 이차원 배열 생성 */
		
		int [][] num3;
		//num3 = new int[3][4]; //앞에가 행 뒤에가 열 둘다 크기 지정 가
		num3 = new int[3][];  //행만 크기 지정 가능. 행 크기는 무조건 지정해줘야함
		//num3은 참조변수면서 로컬변수이기 때문에 스택 메모리에 생성되고 크기를 3으로 지정했기 때문에
		//힙 메모리에 크기가 3인 행에 생성됨
		
		num3[0] = new int[3];
		num3[1] = new int[2]; // 열 크기는 각각 따로 선언 가능하다.
		//크기를 참조변수 생성후에 지정했기 때문에 미리 생성된 힙 메모리에 있던 행 3개에 위치가 저장되고 또한 힙메모리에 각 행에 대한 열의 배열이 생김
		//
		//스택메모리                힙 메모리
		//num3(위치 저장) ------->  num[0]  --> num[0][0] num[0][1] num[0][2]
		//						  num[1]  --> num[1][0] ....
		//						  num[2]
		//
		
		
		/* 리터럴 이용하여 이차원 배열 생성 */
		
		int [][] num4 = new int[][] {{1,2},{3,4,5},{6,7,8,9}};
	
		//배열은 변수 즉 참조변수이기 때문에 파라미터로 넘겨줬을때 주소값을 넘겨주게 된다.
		//그래서 파라미터로 넘겨준 곳에서 배열의 값을 변화시키면 원래 배열도 값이 변하게 된다.\
		
		/* System.arraycopy 사용하기 */
		//System.arraycopy( object src, int srcPos, Object dest, int destPos, int length);
		//					복사할 대상,	복사 시작지점, 복사한거 받을대상, 받을대상에서 시작위치, 복사할만큼의 길
		int [] source = {1,2,3,4};
		int [] destination = {10,9,8,7,6,5,4};
		
		System.arraycopy(source, 0, destination, 0, source.length);
	
		/* argument 사용방법 책 99쪽 확인 */
	}
	String name;
	public Ex02_1(String n){
		name = n;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}




