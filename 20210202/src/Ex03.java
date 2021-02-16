/*
 * 다음식을 만족하는 A와 B의 조랍을 구하라
 * A B
 * B A
 * 9 9
 */
public class Ex03 {

	public static void main(String[] args) {
		int a = 0; // 증가 하기로 하고..
		int b = 9; // 감소 하기로 합시다.

		while (a < 10) {
			a++;
			b--;
			if( (a+b) == 9){
				System.out.println("a = "+a);
				System.out.println("b = "+b);
			}
		}
	}
}
