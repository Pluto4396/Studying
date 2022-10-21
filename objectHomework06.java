import java.util.Scanner;
public class objectHomework06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要进行计算的两个数字");
        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();
        Cale cale = new Cale(num1, num2);
        System.out.println(cale.add1());
        System.out.println(cale.reduce());
        System.out.println(cale.ride());
        if(cale.divide() != null) {
            double num3 = cale.divide();
            System.out.println(num3);
        }
    }
}
class Cale{
    double num1;
    double num2;
    public Cale(double n1,double n2){
        this.num1 = n1;
        this.num2 = n2;
    }
    public double add1(){
        return num1 + num2;
    }
    public double reduce(){
        return num1 - num2;
    }
    public double ride(){
        return num1 * num2;
    }
    public Double divide(){
        if(num2 == 0){
            System.out.println("除法的被除数不能为零");
            return null;
        }else{
            double n = num1 / num2;
            return n;
        }
    }
}