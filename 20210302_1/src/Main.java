import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	/*
	 * 1. �л����
	 * 2. �л���ȸ
	 * 
	 * 3. �л�����
	 * 4. �л�����
	 * 5. �л� ���Ϸ� ����
	 */
	
	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String a = br.readLine();
		
		Student[] student = new Student[50];
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("���ҷ���? 1,2,3,4 ����");
			int select = scan.nextInt();
			System.out.println("select = "+ select);
			if(select ==1){
				//�л����
				scan.nextLine();
				System.out.println("�̸���? ");
				String name = scan.nextLine();
				System.out.println("������? ");
				String gender = scan.nextLine();
				System.out.println("����?");
				int age = scan.nextInt();
				student[0] = new Student(name, gender, age);
			}
			else if(select==2)
			{
				System.out.println("===�л���ȸ===");
				for(int i=0; i<student.length;i++){
					System.out.println(i+" = "+student[i]);
					if(student[i] != null)
						student[i].print();
				}
				System.out.println("============");
			}
			else{
				System.out.println("����˴ϴ�.");
				break;
			}
		}
	}
}











