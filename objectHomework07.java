public class objectHomework07 {
    public static void main(String[] args) {
        Dog dog = new Dog("jack","黑白相间",5);
        dog.show();
    }
}
class Dog{
    String color;
    String name;
    int age;
    public Dog(String color,String name,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void show(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(age);
    }
}