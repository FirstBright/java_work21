
public class Ex02 {

	public static void main(String[] args) {
//		int total = 1;
//		
//		for (int i = 1; i < 11; i++) {
//			total *=i;
//		}
//		System.out.println("1부터 10까지의 곱은 = "+total);
//		
//		for(int i =1; i<10; i++){
//			System.out.println("5 * "+ i +" = "+5*i);
//		}
		// 135 page
		/*
		 * 구구단의 짝수 단인 2,4,6,8단만 출력하는 프로그램을 작성하되
		 * 2단은 2*2 까지
		 * 4단은 4*4 까지
		 * 6단은 6*6 까지
		 * 8단은 8*8 까지
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













