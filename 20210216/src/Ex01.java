/*
 * 문제
 * 정수 둘을 인자로 전달받아서 두수의 사칙연산의 결과를 출력하는 메소드와
 * 이 메소드를 호출하는 main메소드를 정의해보자
 * 단 나눗셈은 몫과 나머지를 출력해야 한다.
 * 
 * 정수 둘을 인자로 전달 받아서 두수의 차의 절대값을 계산하여 출력하는 메소드와
 * main 메소드를 정의해보자
 * 단 메소드 호출시 전달되는 값의 순서에 상관없이 절대값을 계산해야 한다.
 * 
 * 자동정렬 ctrl + shift + f
 */
class MyCal{
	public void doAdd(int num1,int num2){ System.out.println(num1+num2); }
	public void doMin(int num1,int num2){ System.out.println(num1-num2); }
	public void doMul(int num1,int num2){ System.out.println(num1*num2); }
	public void doDivRe(int num1,int num2){ System.out.println(num1/num2); 
											System.out.println(num1%num2); }
}
public class Ex01 {
	
	public static void main(String[] args) {
		MyCal mc = new MyCal();
		mc.doAdd(10, 20);
		mc.doMin(30, 20);
		mc.doMul(5,3);
		mc.doDivRe(9, 2);
	}
	
}











