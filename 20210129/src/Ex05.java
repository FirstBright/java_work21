
public class Ex05 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		
		System.out.println(a--);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		
		// 0 0 0 ->1
		// 1 0 1 ->0
		// 0 1 1 ->0
		// 1 1 1 ->0??
		//
	}
}
