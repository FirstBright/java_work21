package aa.bb.cc;

// public 모든 접근 허용
// private 같은 java 클래스 안에서 허용

public class Student {
	public int x = 10;
	private int y = 20;
	
	int z = 30;	// default
	protected int k = 40;
	
	// alt+ shift + s ->r
	protected int getY(){
		return this.y;
	}
}
