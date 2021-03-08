import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	/*
	 * 1. 학생등록
	 * 2. 학생조회
	 * 
	 * 3. 학생수정
	 * 4. 학생삭제
	 * 5. 학생 파일로 저장
	 */
	
	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String a = br.readLine();
		
		Student[] student = new Student[50];
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("뭐할래요? 1,2,3,4 선택");
			int select = scan.nextInt();
			System.out.println("select = "+ select);
			if(select ==1){
				//학생등록
				scan.nextLine();
				System.out.println("이름은? ");
				String name = scan.nextLine();
				System.out.println("성별은? ");
				String gender = scan.nextLine();
				System.out.println("나이?");
				int age = scan.nextInt();
				student[0] = new Student(name, gender, age);
			}
			else if(select==2)
			{
				System.out.println("===학생조회===");
				for(int i=0; i<student.length;i++){
					System.out.println(i+" = "+student[i]);
					if(student[i] != null)
						student[i].print();
				}
				System.out.println("============");
			}
			else{
				System.out.println("종료됩니다.");
				break;
			}
		}
	}
}












