import java.util.Arrays;
import java.util.List;

class AAA{
	int a = 10;
	public void doA(BBB b){
		b.b = 30;
	}
}
class BBB{
	int b = 20;
	public void doB(AAA a){
		a.a = 40;
	}
}
/*
 * c언어 ...도전프로그램 3 ... 
 * 자바 팩토리얼... 
 */
public class Ex07 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList( 1, 4, 2, 3, 0 ); 

		System.out.println( "Unsorted List:" + list);

		// Sort the list
		list.sort( (a, b) -> a.compareTo( b ) );

		System.out.println( "Sorted List:" + list);
		// abcdef abcdef 10만개??
		String d = "aaaaa";
		System.out.println(d.hashCode());

		String a = "abc";
		String b = "abd";
		
		String c = "abc";
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo(c));
				
	}
}













