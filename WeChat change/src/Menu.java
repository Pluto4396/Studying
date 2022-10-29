import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

public class Menu {//零钱通的基础菜单
    public void print1(){//为用户打出零钱通的菜单（没有实际功能
        System.out.println("-----------零钱通-----------");
        System.out.println("1. 零钱通明细");
        System.out.println("2. 收益入账");
        System.out.println("3. 消费");
        System.out.println("4. 退出");
    }
    public Double choose(){//令用户进行选择要使用哪个功能
        System.out.println("请输入（1——4）的整数（若为小数会发生自动转换）");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        n = (int)n;
        if (n >= 1 && n <= 4){
            return n;
        }else{
            System.out.println("您的输入有误，请输入（1——4）的整数");
            return null;
        }
    }

}
