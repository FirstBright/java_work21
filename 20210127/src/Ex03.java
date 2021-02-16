class A{
	public int a=10;
	public int b=20;
}
public class Ex03 {
	Ex03(){
		A a = new A();
		doA(a);
		System.out.println(a.a);
		System.out.println(a.b);
	}
	public void doA(A a){
		a.a = 20;
		a.b = 30;
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
