import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// import 자동 정리 ctrl + shift + o 
// 빠른 에러처리 ctrl + 1

/*
 * 두개의 정수를 입력 받아서 두수의 차를 출력하는 프로그램을 구현해보자.
 * 단 무조건 큰수에서 작은 수를 뺀 결과를 출력해야 한다.
 * 개발업체
 */
public class Ex04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("a 숫자 입력: ");
		int a = scan.nextInt();
		System.out.println("b 숫자 입력: ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		if(a > b){
			System.out.println("a - b = "+ (a-b));
		}else{
			System.out.println("b - a = "+ (b-a));
		}
	}
}





















