import java.util.Scanner;

public class objectHomework12 {//实现与电脑进行猜拳游戏（使用方法相关知识）0石头1剪刀2布

    public static void main(String[] args) {
        Guess guess = new Guess();

        Scanner scanner = new Scanner(System.in);
        System.out.println("是否要开始和系统进行猜拳游戏,输入是或否");
        char comp = scanner.next().charAt(0);
        if (comp == '是') {
            guess.start1();
        } else if (comp == '否') {
            System.out.println("欢迎您下次前来游玩");
        } else {
            System.out.println("请输入正确的字符");
        }

    }
}
class Guess {
    int count1 = 0;
    public double ran1() {//生成随机数用来表示系统的石头剪子布
        return Math.random() * 100 + 1;
    }//赋随机值用来判断

    public int start() {
        double systemnum = ran1();
        double n1 = 100 / 3;
        double n2 = 200 / 3;
        if (0 < systemnum && systemnum <= n1) {
            return 0;//系统出石头
        } else if (n1 < systemnum && systemnum <= n2) {
            return 1;//系统出剪刀
        } else {
            return 2;//系统出布
        }
    }//判断出系统的出拳情况

    public int info() {
        int n = start();
        if (n == 0) {
            System.out.println("系统本轮出的是石头");
        } else if (n == 1) {
            System.out.println("系统本轮出的是剪刀");
        } else if (n == 2) {
            System.out.println("系统本轮出的是布");
        }
        return n;
    }//打印出系统的出拳情况

    public void comperaWith(int gamePlayer) {
        int computerNum = info();
        if (gamePlayer == 0) {
            if (computerNum == 0) {
                System.out.println("本轮平局");
            } else if (computerNum == 1) {
                System.out.println("本轮玩家获胜");
                count1++;
            } else if (computerNum == 2) {
                System.out.println("本轮系统获胜");
            }
        }
        if (gamePlayer == 1) {
            if (computerNum == 0) {
                System.out.println("本轮系统获胜");
            } else if (computerNum == 1) {
                System.out.println("本轮平局");
            } else if (computerNum == 2) {
                System.out.println("本轮玩家获胜");
                count1++;
            }
        }
        if (gamePlayer == 2) {
            if (computerNum == 0) {
                System.out.println("本轮玩家获胜");
                count1++;
            } else if (computerNum == 1) {
                System.out.println("本轮系统获胜");
            } else if (computerNum == 2) {
                System.out.println("本轮平局");
            }
        }
    }//判断输赢

    public void start1() {
        int i = 1;
        for (; ; i++) {//玩家的输入
            System.out.println("输入您出什么（0——石头 1——剪刀 2——布）");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            comperaWith(n);
            int m = repeatConcle();
            if (m == 0){
                break;
            } else if (m == 2) {
                break;
            } else if (m == 1) {}
        }
        System.out.println("一共进行了" + i + "轮游戏，其中玩家获胜了" + count1 +"局");
        System.out.println("感谢您本次的游玩，欢迎下次再来");
    }
    public int repeatConcle() {//循环控制
        System.out.println("是否继续游戏（1表示继续，2表示退出）,若输入其他字将会默认退出");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            return 1;
        }
        else if (n == 2) {
            return 2;
        }else
            return 0;
    }
}