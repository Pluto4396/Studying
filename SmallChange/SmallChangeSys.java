package SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;//判定循环
        String n = "";//进入哪个程序的取值
        String details = "";//拼接字样
        double money = 0;//钱
        Date time = null;//打印时间
        double balance = 0;//总余额
        String name = "";//商家名字
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        do {
            System.out.println("===============零钱通===============");
            System.out.println("\t\t\t"+"1. 零钱通明细");
            System.out.println("\t\t\t"+"2. 收益入账");
            System.out.println("\t\t\t"+"3. 消费");
            System.out.println("\t\t\t"+"4. 退     出");
            System.out.println("请输入（1——4）的整数");
            Scanner scanner = new Scanner(System.in);
            n = scanner.next();
           switch (n){
               case "1":
                   System.out.println("\n"+"---------------零钱通明细---------------");
                   System.out.println(details);
                    break;
               case "2":
                   time = new Date();
                   System.out.println("收益金额");
                   money = scanner.nextDouble();
                   if(money <= 0){
                       System.out.println("收益应该为正数");
                       break;
                   }
                   balance += money;
                   details += "\n"+"收益入账" +"\t" + money + "\t" + sdf.format(time) + "\t" + balance;
                    break;
               case "3":
                   time = new Date();
                   System.out.println("消费金额");
                   money = scanner.nextDouble();
                   balance -= money;
                   System.out.println("消费商家");
                   name = scanner.next();
                   if (balance < money || money < 0){
                       System.out.println("余额不足或是支出不正确");
                       break;
                   }
                   details += "\n"+ name +"\t-" + money + "\t" + sdf.format(time) + "\t" + balance;
                    break;
               case "4":
                   String choose = "";//判断是否退出
                   while (true){
                       System.out.println("是否要确定退出（y/n）");
                       choose = scanner.next();
                       if (choose.equals("y") || choose.equals("n")){
                           break;
                       }
                   }
                   if (choose.equals("y")){
                       loop = false;
                   }
                    break;
               default:
                   System.out.println("你的输出有误");

           }
        }while (loop);
        System.out.println("程序结束");
    }
}
