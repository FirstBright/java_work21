/*
 * 1�̻� 100�̸��� ���� �߿��� 7�� ����� 9�� ����� ����ϴ� ���α׷�
 * �� 7�� ����̸鼭 9�� ����ΰ��� �ѹ��� ���
 * 
 * ���׿����ڸ� �� ���鼭.. �����ؾߵ�..
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