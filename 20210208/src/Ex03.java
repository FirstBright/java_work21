
public class Ex03 {

	public static String doA(int a){
		System.out.println("???丮?? ?Լ?");
		if(a > 0){
			// 3 * doA(2) 
			// 3 * 2 * doA(1)
			// 3 * 2 * 1 * doA(0)
			// 3 * 2 * 1 * 1 = 6 
			// "3 * 2 * 1 * 1"
			return a +"*"+ doA(a-1);
		}else{
			return "1";	
		}
	}
	
	public static void main(String[] args) {
		String returnValue = doA(5);
		System.out.println("returnValue = "+returnValue);
	}
}
