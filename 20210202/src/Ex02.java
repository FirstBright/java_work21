
public class Ex02 {

	public static void main(String[] args) {
//		int total = 1;
//		
//		for (int i = 1; i < 11; i++) {
//			total *=i;
//		}
//		System.out.println("1���� 10������ ���� = "+total);
//		
//		for(int i =1; i<10; i++){
//			System.out.println("5 * "+ i +" = "+5*i);
//		}
		// 135 page
		/*
		 * �������� ¦�� ���� 2,4,6,8�ܸ� ����ϴ� ���α׷��� �ۼ��ϵ�
		 * 2���� 2*2 ����
		 * 4���� 4*4 ����
		 * 6���� 6*6 ����
		 * 8���� 8*8 ����
		 */
		for(int i=2 ; i<9 ; i = i+2 ){
//			System.out.println("i = "+i);
			for(int j=1 ; j<i+1; j++){
//				System.out.println("j = "+j);
				System.out.println(i+" * "+ j+" = "+(i*j));
			}
			System.out.println();
		}
	}
}













