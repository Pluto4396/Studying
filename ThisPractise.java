public class ThisPractise{
	public static void main(String[] args) {
		Person p1 = new Person("mary",60);
		Person p2 = new Person("jacky",50);
		System.out.print(p1.comepareTo(p2));
		
	}
}
class Person{
	int age;
	String name;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public boolean comepareTo(Person p){
		if (this.name.equals(p.name) && this.age == age) {
			return true;
		}else
		return false;
	}
}