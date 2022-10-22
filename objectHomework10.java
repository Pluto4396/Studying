public class objectHomework10 {
    public static void main(String[] args) {
        Employee employee = new Employee("jack",'男',25,"搬砖",8000);
    }
}
class Employee{
    String name;
    char genarity;
    int age;
    String job;
    double salary;
    public Employee(String name,char genarity,int age,String job,double salary){
        this.name = name;
        this.genarity = genarity;
        this.age = age;
        this.job = job;
        this.salary = salary;
    }
    public Employee(String name,char genarity,int age){
        this.name = name;
        this.genarity = genarity;
        this.age = age;
    }
    public Employee(String job,double salary){
        this.job = job;
        this.salary = salary;
    }
}