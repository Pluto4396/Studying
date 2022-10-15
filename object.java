public class object{
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		Tool print1 = new Tool();
		print1.arr(arr);
		Person my1 = new Person();
		my1.age = 20;
		my1.weight = 65;
		my1.high = 185;
		Person my2 = print1.clone(my1);
		System.out.println(my2.age + "\t" + my2.weight + "\t" + my2.high);
		System.out.println(my1 == my2);
	}
}
class Tool{
	public void arr(int[][] n){
		for (int j = 0;j < n.length ;j++ ) {
			for (int i = 0;i < n[j].length ; i++) {
				System.out.print(n[j][i]);
			}
			System.out.println();
		}
	}
	public Person clone(Person me){
		Person my2 = new Person();
		my2.age = me.age;
		my2.weight = me.weight;
		my2.high =  me.high;
		return my2;
	}
}
class Person{
	int age;
	int weight;
	int high;
}