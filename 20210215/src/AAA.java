class BBB{
	int a = 10;
	int b = 20;
}
public class AAA {
	public static void main(String[] args) {
		BBB b1 = new BBB();
		BBB c1 = b1;
		System.out.println("b1.a = "+b1.a);
		System.out.println("b1.b = "+b1.b);
		
		System.out.println("c1.a = "+c1.a);
		System.out.println("c1.b = "+c1.b);
		
		b1.a = 30;
		
		System.out.println("b1.a = "+b1.a);
		System.out.println("b1.b = "+b1.b);
		
		System.out.println("c1.a = "+c1.a);
		System.out.println("c1.b = "+c1.b);
	}
}
