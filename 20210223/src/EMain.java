import java.util.Scanner;

public class EMain {
	public static void main(String[] args) {
		Employee emp = new Employee();
//		emp.name = "홍길동";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 입력해랍");
		String name = scan.nextLine();
		emp.setName(name);
		
		System.out.println("주민번호 입력해랍");
		String jumin = scan.nextLine();
		emp.setJumin(jumin);
		
		System.out.println("급여 입력해랍");
		int sal = scan.nextInt();
		emp.setSal(sal);
		
		emp.doPrint();
		
	}
}













