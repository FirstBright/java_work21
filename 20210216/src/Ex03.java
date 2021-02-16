import aa.bb.cc.Triangle;

/*
 * 밑변과 높이 정보를 저장 할 수 있는 Triangle 클래스를 정의하자
 * 
 * 그리고 
 * 1. 밑변과 높이 정보를 변경할 수 있는 메소드와 
 * 2. 삼각형의 넓이를 계산해서 반환하는 메소드
 * 도 함께 정의하자
 * 
 * 물론 이 클래스의 활용의 예를 보이는 main 메서드를 정의하자
 */
public class Ex03 {
	
	// 선언 부분으로 이동 
	// ctrl + 마우스왼쪽클릭 or f3
	
	// 소스 뒤로 이동 
	// ctrl + <-
	// 소스 앞으로 이동
	// ctrl + ->
	
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		double area = tri.getArea();
		System.out.println("area = "+ area);
		tri.setXY(3, 2);
		area = tri.getArea();
		System.out.println("area = "+ area);
		
	}
}
