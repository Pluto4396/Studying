public class Overload01{
	public static void main(String[] args) {
		Exercise use = new Exercise();
		use.m(9);
		use.m(6,9);
		use.m("��ϰ");
	}
}
class Exercise{
	public void m(int n){
		int res = n * n;
		System.out.println("��һ��m������");
		System.out.println(res);
	}
	public void m(int n1,int n2){
		int res = n1 * n2;
		System.out.println("�ڶ���m������");
		System.out.println(res);
	}
	public void m(String n){
		System.out.println("������m������");
		System.out.println(n);
	}
}