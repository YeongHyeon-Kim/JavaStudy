package study8;

import java.util.Scanner;

public class Scanner_study {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		System.out.println(a);
		
		String b = scan.nextLine();
		//위와 같이 사용하면 next에 다음으로 받아오는게 엔터이기 때문에
		//nextLine에서 값을 제대로 받아오지 못한다.
		//그래서 next 다음에 nextline을 사용하려면 아래와 같이 사용해야함
		
		String a1 = scan.next();
		System.out.println(a1);
		scan.nextLine();
		String b1 = scan.nextLine();
		
		scan.close();
		// 자원 반납
		
	}

}
