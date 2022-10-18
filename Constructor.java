public class Constructor{
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("tom",55);
		System.out.println(p2.name + " " + p2.age);
		System.out.println(p1.name + " " + p1.age);
	}
}
class Person{
	int age;
	String name;
	public Person(){
	 	age = 18;
	}
	public Person(String pname,int page){
		name = pname;
		age = page;
	}
}