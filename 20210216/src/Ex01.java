/*
 * ����
 * ���� ���� ���ڷ� ���޹޾Ƽ� �μ��� ��Ģ������ ����� ����ϴ� �޼ҵ��
 * �� �޼ҵ带 ȣ���ϴ� main�޼ҵ带 �����غ���
 * �� �������� ��� �������� ����ؾ� �Ѵ�.
 * 
 * ���� ���� ���ڷ� ���� �޾Ƽ� �μ��� ���� ���밪�� ����Ͽ� ����ϴ� �޼ҵ��
 * main �޼ҵ带 �����غ���
 * �� �޼ҵ� ȣ��� ���޵Ǵ� ���� ������ ������� ���밪�� ����ؾ� �Ѵ�.
 * 
 * �ڵ����� ctrl + shift + f
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










