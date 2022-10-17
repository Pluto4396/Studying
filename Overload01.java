public class Overload01{
	public static void main(String[] args) {
		Exercise use = new Exercise();
		use.m(9);
		use.m(6,9);
		use.m("练习");
	}
}
class Exercise{
	public void m(int n){
		int res = n * n;
		System.out.println("第一个m被调用");
		System.out.println(res);
	}
	public void m(int n1,int n2){
		int res = n1 * n2;
		System.out.println("第二个m被调用");
		System.out.println(res);
	}
	public void m(String n){
		System.out.println("第三个m被调用");
		System.out.println(n);
	}
}