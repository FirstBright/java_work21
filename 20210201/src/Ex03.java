/*
 * 1이상 100미만인 정수 중에서 7의 배수와 9의 배수를 출력하는 프로그램
 * 단 7의 배수이면서 9의 배수인것은 한번만 출력
 * 
 * 삼항연산자를 좀 쓰면서.. 공부해야됨..
 */
public class Ex03 {

	public static void main(String[] args) {
		int i = 1;
		while (i < 100) {
			i++;
//			String a = i % 7 == 0? "i= "+i: "";
//			String b = i % 9 == 0? "i= "+i: "";
//			System.out.print(a+" ");
//			System.out.print(b);
			System.out.print(i % 7 == 0? "i= "+i: "");
			System.out.print(i % 9 == 0? "i= "+i: "");
//			if (i % 7 == 0) {
//				System.out.println("i = " + i);
//				continue;
//			}
//			if (i % 9 == 0) {
//				System.out.println("i = " + i);
//				continue;
//			}
			
		}
	}

}
