import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Secondway extends Allmoney{//实现收益入账
    private double money;

    public void setMoney(double money) {//改变入账的钱
        this.money = money;
    }

    public double getMoney() {//得到入账的钱
        return money;
    }

    public void accept1(){//接受收益入账的功能(money)
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入收益金额");
        double money = scanner.nextDouble();
        setMoney(money);
        setAllMoney(money);
    }



    public void use1(){//使用以上过程
        System.out.println( "收益入帐+"+ "\t" + getMoney() + "\t" + getTime() + "\t" +"余额"+ "\t" + getAllMoney());

    }
    public void infor(){//显示收益入账的详细功能
        accept1();
        setTime();
        use1();
        remember();
        Forthway forthway = new Forthway();
        forthway.exit_();
    }
}
