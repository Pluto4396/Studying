import java.util.Scanner;

public class Thirdway extends Allmoney{
    private double money;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void accept2(){//接受支出入账的功能(money)
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入支出商家");
        String name = scanner.next();
        System.out.println("输入支出金额");
        double money = scanner.nextDouble();
        setMoney(money);
        setAllMoney(money);
        setName(name);
    }
    public void use1(){//使用以上过程
        System.out.println( getName()+ "\t" + "-" +getMoney() + "\t" + getTime() + "\t" +"余额"+ "\t" + getAllMoney());
    }
    public void infor(){//显示支出入账的详细功能
        accept2();
        setTime();
        use1();
        remember();
        Forthway forthway = new Forthway();
        forthway.exit_();
    }
}
