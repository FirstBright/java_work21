import aa.bb.cc.Triangle;

/*
 * �غ��� ���� ������ ���� �� �� �ִ� Triangle Ŭ������ ��������
 * 
 * �׸��� 
 * 1. �غ��� ���� ������ ������ �� �ִ� �޼ҵ�� 
 * 2. �ﰢ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ�
 * �� �Բ� ��������
 * 
 * ���� �� Ŭ������ Ȱ���� ���� ���̴� main �޼��带 ��������
 */
public class Ex03 {
	
	// ���� �κ����� �̵� 
	// ctrl + ���콺����Ŭ�� or f3
	
	// �ҽ� �ڷ� �̵� 
	// ctrl + <-
	// �ҽ� ������ �̵�
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