/*
 * �������� �����ϴ� A�� B�� ������ ���϶�
 * A B
 * B A
 * 9 9
 */
public class Ex03 {

	public static void main(String[] args) {
		int a = 0; // ���� �ϱ�� �ϰ�..
		int b = 9; // ���� �ϱ�� �սô�.

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
