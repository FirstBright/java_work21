public class Employee {
	
	private String name;
	private String Jumin;
	private int sal;
	public void setName(String name){
		this.name = name;
	}
	// alt + shift + s -> r
	
	public void doPrint(){
		System.out.println("이름"+name);
		System.out.println("주민"+Jumin);
		System.out.println("연봉"+sal);
	}
/* 
 private 접근제어지시자 설정
 	1.setName...
 	2.생성자로..
*/
	public void setJumin(String jumin) {
		Jumin = jumin;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
}
