package Study1_5;


class VarTest{
	public VarTest(int ...x) {
		System.out.println("생성자의 인자 갯수 " + x.length);
	}
	public void sayEcho(String ...names) {
		for (int x = 0; x<names.length; x++) {
			System.out.println(names[x]+"\t");
		}
	}
}


public class study_Varargs {
/*
 * 가변인자지정자 리턴타입 메서드명(데이터 ...변수명){}
 */
	
	public static void main(String[] args) {
		VarTest v1 = new VarTest(10);
		VarTest v2 = new VarTest(10,20);
		VarTest v3 = new VarTest(10,20,30,40,50);
		v1.sayEcho("김영현", "전종현", "박수");
		
	}
}
