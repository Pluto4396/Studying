public class VariableParameters{
	public static void main(String[] args) {
		T ok = new T();
		int n1 = ok.pri("С��",96,98,97);
		int n2 = ok.pri("С��",95,94,98);
		int n3 = ok.pri("С��",95,98,97);
		System.out.println();
		System.out.println("С���ܷ�" + n1);
		System.out.println("С���ܷ�" + n2);
		System.out.println("С���ܷ�" + n3);
	}
}
class T{
	public int pri(String n,int...m){
		System.out.print(n);
		int res = 0;
		for (int j = 0;j < m.length;j++ ) {
			System.out.print(m[j] + " ");
			res += m[j];
		}
		return res;
	}
}